/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情
 *
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/8/2 下午5:05 $$
 */
@Getter
@Setter
public class OrderDetailDTO extends OrderSimpleinfoDTO{
    private static final long serialVersionUID = 1L;

    /**
     * 商品列表
     * @see OrderItemDTO
     */
   private List<OrderItemDTO> products;

    /**
     * 使用券列表
     * @see OrderCouponRefDTO
     */
   private List<OrderCouponRefDTO> orderCouponRefDTOList;


}
