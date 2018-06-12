/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商户订单点菜详情
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/11/14 17:39 $$
 */
@Getter
@Setter
public class MerchantOrderItemDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 订单id
     */
    private String orderId;
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

    @Override
    public String toString() {
        return "MerchantOrderItemDTO{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", realPrice=" + realPrice +
                ", num=" + num +
                ", itemTotalAmount=" + itemTotalAmount +
                ", realItemTotalAmount=" + realItemTotalAmount +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
