package com.yancy.springboot.starter.idmarket;

import java.io.Serializable;

/**
 * 业务类型枚举
 *
 * @author:yaoxin
 * @date:Created in 2018/5/31 15:47
 * @description:
 */
public enum BusinessType implements Serializable{

    REPAST_ORDER(1L),//餐饮订单
    /**
     * 商户积分批次记录id
     */
    CREDITS_BATCH_RECORD(2L),
    /**
     * 商户积分记录id
     */
    CREDITS_RECORD(3L),
    /**
     * 支付记录id
     */
    PAY_RECORD(4L),
    /**
     * 退款记录id
     */
    REFUND_RECORD(5L);

    private static final long serialVersionUID = 1L;
    private long value;

    private BusinessType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }
}
