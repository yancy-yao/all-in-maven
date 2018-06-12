/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 新建订单入参
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/8/2 下午4:54 $$
 */
@Getter
@Setter
public class CreateOrderInputDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final Integer STATUS_ENABLE = 1;

    public static final Integer PAY_STATUS_COMPLETE = 1;

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
     * 不参与优惠金额
     */
    private Long noDiscountAmount;

    /**
     * 门店id(卖家)
     */
    private Long storeId;
    /**
     * 商家id
     */
    private Long merchantId;

    /**
     * 账户id(买家)
     */
    private Long accountId;

    /**
     * 预约id
     */
    private Long bespeakId;

    /**
     * 就餐id
     */
    private Long repastId;
    /**
     * 接入方id,TODO：需要实现逻辑
     */
    private Long businessId;
    /**
     * 业务类型 TODO：需要实现逻辑
     */
    private Integer businessType;
    /**
     * 餐位
     */
    private String repastLocationKey;
    /**
     * 桌位id
     */
    private Long tableId;

    /**
     * 备注
     */
    private String remarks;
    /**
     * 订单类型,1:线下消费,2:线下扫码,3:核销,4:外卖,5:商城,6:分销商进货，7:购券
     */
    private Integer orderType;

    /**
     * 菜品列表
     */
    private List<OrderItemDTO> products;

    /**
     * 类别(1:线下,2:线上,3:无需付款)
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
     * 支付渠道,1:支付宝,2:微信,3:手Q,4:无需付款
     */
    private Integer payChannel;

    /**
     * 订单附件
     */
    private OrderAttachmentDTO orderAttachment;


    /**
     * 订单logo 图片
     */
    private String logoPic;

    /**
     * 订单是否可退 0不可退 1可退
     */
    private Integer refundable;

    /**
     * 员工id
     */
    private Long employeeId;
}
