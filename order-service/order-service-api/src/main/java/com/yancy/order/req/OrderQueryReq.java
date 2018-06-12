/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.req;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 订单查询实体
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/10/26 下午2:25 $$
 */
@Getter
@Setter
public class OrderQueryReq implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final Integer V_TYPE_ORDER_PAY = 1;
    public static final Integer V_TYPE_CASH_PAY = 2;
    public static final Integer V_TYPE_SCAN_PAY = 3;


    /**
     * 页数
     */
    private Integer page;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 门店id
     */
    private Long storeId;

    /**
     * 开始时间
     */
    private Long startTime;

    /**
     * 结束时间
     */
    private Long endTime;

    /**
     * 显示类型(1:订单支付,2:现金支付,3:扫码支付)
     */
    private Integer vType;

    /**
     * 支付渠道,1:支付宝,2:微信
     */
    private List<Integer> payTypes;

    /**
     * 订单类型 1 线下消费 3 核销卡券
     */
    private List<Integer> orderTypes;

    /**
     * 是否需要订单详情 1需要 0不需要
     */
    private Integer needDetail;

}
