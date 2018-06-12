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
 * 当用户消费用券时，记录券跟订单的关联实体
 */
@Getter
@Setter
public class OrderCouponRefDTO implements Serializable {
    /**
     * 主键id,自增
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 券id
     */
    private Long couponId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * 版本号
     */
    private Integer ver;

    private static final long serialVersionUID = 1L;
}