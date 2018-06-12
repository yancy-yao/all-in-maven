/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */
package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订单商品
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/8/7 14:47 $$
 */
@Setter
@Getter
public class OrderItemDTO implements Serializable {
    private static final long serialVersionUID = 3633606591616247467L;
    /**
     * 主键
     */
    private Long id;


    /**
     * 关联产品id
     */
    private Long productId;

    /**
     * 关联产品名称
     */
    private String productName;

    /**
     * 产品单价(标价)
     */
    private Long price;

    /**
     * 产品单价(卖价)
     */
    private Long realPrice;

    /**
     * 产品数量
     */
    private Integer num;

    /**
     * 单项小计金额(标价,人民币分)
     */
    private Long itemTotalAmount;

    /**
     * 单项小计金额(卖价,人民币分)
     */
    private Long realItemTotalAmount;

    /**
     * 图片资源定位符
     */
    private String picUrl;

    /**
     * 单位
     */
    private String unit;

}
