package com.yancy.springboot.starter.idmarket;

import com.google.common.base.Preconditions;

/**
 * 发号器工具类
 *
 * @author:yaoxin
 * @date:Created in 2018/5/31 15:45
 * @description:
 */
public class IdMarkets {

    private static IdMarket idMarket;

    static void setIdMarket(IdMarket idMarket) {
        IdMarkets.idMarket = idMarket;
    }

    public static long nextId(BusinessType businessType) {
        Preconditions.checkArgument(null != businessType);
        Preconditions.checkArgument(null != idMarket);
        return idMarket.nextId(businessType);
    }

}
