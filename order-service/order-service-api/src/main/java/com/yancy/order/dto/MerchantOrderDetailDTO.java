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
 * 商户订单详情
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/11/14 17:39 $$
 */
@Setter
@Getter
public class MerchantOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String ORDER_DETAIL_ATTACHMENT_KEY_REPASTID = "repastId";
    public static final String ORDER_DETAIL_ATTACHMENT_KEY_REPASTLOCATIONKEY = "repastLocationKey";
    public static final String ORDER_DETAIL_ATTACHMENT_KEY_STARTTIME = "startTime";
    public static final String ORDER_DETAIL_ATTACHMENT_KEY_SEATNAME = "seatName";


    private List<MerchantOrderItemDTO> merchantOrderItemDTOList;


    /**
     * 物理主键
     */
    private String id;

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
     * 支付时间
     */
    private Long payTime;
    /**
     * 关闭时间
     */
    private Long closeTime;
    /**
     * 支付状态(0:未支付完成,1:已支付完成)
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
     * 商家id
     */
    private Long merchantId;
    /**
     * 支付类别(1:线下,2:线上,3:无需付款)
     */
    private Integer type;
    /**
     * 订单状态,1:线下消费,2:线下扫码,3:外卖,4:商城
     */
    private Integer orderType;

    /**
     * 就餐id
     */
    private Long repastId;

    /**
     * 桌台编号
     */
    private String repastLocationKey;

    /**
     * 开台时间
     */
    private Long startTime;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 商家实收金额
     */
    private Long merchantRealAmount;

    /**
     * 联系方式
     */
    private String telephone;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 桌台名称
     */
    private String seatName;

    /**
     * 订单图片
     */
    private String LogoPic;

    /**
     * 支付流水
     */
    private String payFlow;

}
