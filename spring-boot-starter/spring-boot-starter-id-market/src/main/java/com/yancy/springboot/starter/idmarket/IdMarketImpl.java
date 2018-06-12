package com.yancy.springboot.starter.idmarket;

import com.google.common.base.Preconditions;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 生成器定义
 *
 * @author:yaoxin
 * @date:Created in 2018/5/31 15:57
 * @description:
 */
public class IdMarketImpl implements IdMarket {

    private long workId;

    private ConcurrentHashMap<BusinessType, IdWorker> workerHolder = new ConcurrentHashMap<>();

    IdMarketImpl(long workId) {
        this.workId = workId;
    }

    @Override
    public long nextId(BusinessType businessType) {
        Preconditions.checkArgument(null != businessType);
        if (workerHolder.containsKey(businessType)) {
            IdWorker idWorker=workerHolder.get(businessType);
            Preconditions.checkArgument(null != idWorker);
            return idWorker.nextId();
        }

        IdWorker idWorker = new SnowflakeIdWorker(workId, businessType.value());
        workerHolder.put(businessType, idWorker);
        return idWorker.nextId();
    }
}
