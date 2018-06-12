/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.boot.dubbo.listener;

import com.alibaba.dubbo.rpc.Filter;
import com.yancy.boot.dubbo.domain.ClassIdBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 统计filter
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/19 上午10:02 $$
 */
public abstract class StaticsFilterHelper implements Filter {
    public static final Map<ClassIdBean, Map<String, AtomicLong>> STATICS_DATA_MAP =
            new ConcurrentHashMap<ClassIdBean, Map<String, AtomicLong>>();

    public static void increase(ClassIdBean classIdBean, String methodName) {
        Map<String, AtomicLong> methodCountMap = STATICS_DATA_MAP.get(classIdBean);
        if (methodCountMap == null) {
            synchronized (StaticsFilterHelper.class) {
                // double check
                methodCountMap = STATICS_DATA_MAP.get(classIdBean);
                if (methodCountMap == null) {
                    methodCountMap = new ConcurrentHashMap<String, AtomicLong>();
                    STATICS_DATA_MAP.put(classIdBean, methodCountMap);
                }
            }
        }
        AtomicLong count = methodCountMap.get(methodName);
        if (count == null) {
            synchronized (StaticsFilterHelper.class) {
                // double check
                count = methodCountMap.get(methodName);
                if (count == null) {
                    count = new AtomicLong(0);
                    methodCountMap.put(methodName, count);
                }
            }
        }
        count.incrementAndGet();
    }

    public static long getValue(ClassIdBean classIdBean, String methodName) {
        Map<String, AtomicLong> methodCountMap = STATICS_DATA_MAP.get(classIdBean);
        if (methodCountMap == null) {
            return 0;
        }
        AtomicLong count = methodCountMap.get(methodName);
        return count == null ? 0 : count.get();
    }
}

