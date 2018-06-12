/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订单摘要信息
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/10/26 下午2:27 $$
 */
@Getter
@Setter
public class SimpleOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 账户id
     */
    private Long accountId;

    /**
     * 标题
     */
    private String title;

    /**
     * 买家手机号码
     */
    private String buyerMobile;

    /**
     * 买家头像
     */
    private String buyerLogPic;

    /**
     * 支付时间
     */
    private Long payTime;

    /**
     * 付款金额
     */
    private Long realAmount;

    /**
     * 显示类型
     */
    private Integer vType;

    /**
     * 附件信息(json)
     */
    private String attachment;

    /**
     * 商户显示金额
     */
    private Long vMerchantAmount;

    /**
     * 用户显示金额
     */
    private Long vConsumerAmount;

    /**
     * 支付类型
     */
    private Integer payType;

    /**
     * 订单类型
     */
    private Integer orderType;
}
