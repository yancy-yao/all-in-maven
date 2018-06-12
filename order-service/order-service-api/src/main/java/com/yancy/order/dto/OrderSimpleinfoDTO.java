/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */
package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/8/9 10:00 $$
 */
@Getter
@Setter
public class OrderSimpleinfoDTO implements Serializable {


    public static final Integer STATUS_ENABLE = 1;

    public static final Integer PAY_STATUS_UNPAY = 0;//未支付
    public static final Integer PAY_STATUS_COMPLETE = 1;
    public static final Integer PAY_STATUS_FAIL = 2;//支付失败
    public static final Integer PAY_STATUS_ING = 3;//支付中

    public static final Integer PAY_STATUS_REFUND_ING = 4;//退款中
    public static final Integer PAY_STATUS_REFUND_FAIL = 5;//退款失败
    public static final Integer PAY_STATUS_REFUND_COMPLETE = 6;//退款成功


    public static final Integer PAY_TYPE_OFFLINE = 1;
    public static final Integer PAY_TYPE_ONLINE = 2;
    public static final Integer PAY_TYPE_NOPAY = 3;

    public static final Integer ORDER_TYPE_OFFLINE_CONSUME = 1;
    public static final Integer ORDER_TYPE_OFFLINE_SCAN = 2;
    public static final Integer ORDER_TYPE_COUPON_USE = 3;
    //分销商进货
    public static final Integer ORDER_TYPE_DISTRIBUTOR_BUY = 6;
    //购券
    public static final Integer ORDER_TYPE_BUY_COUPON = 7;

    public static final Integer PAY_CHANNEL_ALI_PAY = 1;
    public static final Integer PAY_CHANNEL_WX_PAY = 2;
    public static final Integer PAY_CHANNEL_MOBILE_Q_PAY = 3;
    public static final Integer PAY_CHANNEL_OFFLINE_PAY = 4;
    public static final Integer PAY_CHANNEL_NO_PAY = 5;

    //订单不可退
    public static final Integer REFUNDABLE_NO = 0;

    //订单可退
    public static final Integer REFUNDABLE_YES = 1;

    /**
     * 有效的订单
     */
    public static final Integer ORDER_STATUS_VALID = 0;

    /**
     * 超时关闭的订单
     */
    public static final Integer ORDER_STATUS_TIMEOUT_OFF = 1;


    /**
     * 手动关闭的订单
     */
    public static final Integer ORDER_STATUS_HANDLE_OFF = 2;

    /**
     * 已退款 弃用，将已退款状态写到支付状态中
     */
   // public static final Integer ORDER_STATUS_REFUND = 3;

    /**
     * 物理主键
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 标价总金额
     */
    private Long totalAmount;

    /**
     * 实际总金额
     */
    private Long realTotalAmount;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 关闭时间
     */
    private Date closeTime;

    /**
     * 支付状态(0:未支付,1:已支付,2:支付失败，3:支付中，4:退款中,5退款失败，6退款成功)
     */
    private Integer payStatus;

    /**
     * 订单状态(0:无效,1:有效)
     */
    private Integer status;

    /**
     * 门店id(卖家)
     */
    private Long storeId;

    /**
     * 账户id(买家)
     */
    private Long accountId;

    /**
     * 预约id
     */
    private Long merchantId;


    /**
     * 备注
     */
    private String remarks;
    /**
     * 订单类型,1:线下消费,2:线下扫码,3:核销,4:外卖,5:商城,6:分销商进货，7:购券
     *
     */
    private Integer orderType;

    /**
     * 支付类别(1:线下,2:线上,3:无需付款)
     */
    private Integer type;

    /**
     * 积分
     */
    private Long point;

    /**
     * 余额
     */
    private Long balance;

    /**
     * 现金
     */
    private Long cash;

    /**
     * 支付渠道,1:支付宝,2:微信,3:手Q
     */
    private Integer payChannel;

    /**
     * 附件信息(json)
     */
    private String attachment;

    /**
     * 商家实收金额
     */
    private Long merchantRealAmount;

    /**
     * 订单创建时间
     */
    private Date create;

    /**
     * 订单图片
     */
    private String logoPic;
    /**
     * 支付应用id
     */
    private String payAppId;

    /**
     * 失效订单的类型  0 有效 1超时关闭 2手动关闭
     */
    private Integer orderStatus;

    /**
     * 支付流水
     */
    private String payFlow;

    /**
     * 员工id
     */
    private Long employeeId;

    /**
     * 最后一次支付开始时间
     */
    private Date lastPayStartTime;


    /**
     * 最后一次支付开始时间
     */
    private Date lastPayEndTime;


    /**
     * 最后一次支付开始时间
     */
    private Date lastRefundStartTime;


    /**
     * 最后一次支付开始时间
     */
    private Date lastRefundEndTime;

    /**
     * 订单详情
     * @see MerchantOrderDetailDTO
     *
     */
    private OrderDetailDTO orderDetailDTO;


}
