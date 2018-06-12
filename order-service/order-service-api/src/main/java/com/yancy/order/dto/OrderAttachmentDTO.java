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
 * 订单附件
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/11/15 下午4:22 $$
 */
@Getter
@Setter
public class OrderAttachmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 预约id
     */
    private Long bespeakId;

    /**
     * 就餐id
     */
    private Long repastId;

    /**
     * 桌台id
     */
    private Long tableId;

    /**
     * 桌台名称
     */
    private String seatName;

    /**
     * 桌台
     */
    private String repastLocationKey;

    /**
     * 开台时间
     */
    private Long startTime;

    /**
     * 买家手机号
     */
    private String buyerMobile;

    /**
     * 买家性别(0:未知,1:男,2:女)
     */
    private Integer buyerSex;

    /**
     * 买家坐标[lng,lat]
     */
    private Double[] buyerLocation;

    /**
     * 买家省份id
     */
    private Integer buyerProvinceId;

    /**
     * 买家城市id
     */
    private Integer buyerCityId;

    /**
     * 买家appid
     */
    private Long buyerAppId;

    /**
     * 买家生日
     */
    private String buyeBirthday;

    /**
     * 用户头像
     */
    private String orderPicUrl;

    /**
     * 订单商家名称
     */
    private String orderMerchantName;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 收银员id
     */
    private String cashierId;

    /**
     * 收银员名称
     */
    private String cashierName;

    /**
     * 卖家省id
     */
    private Integer sellerProvinceId;
    /**
     * 卖家市id
     */
    private Integer sellerCityId;

    /**
     * 卖家区县id
     */
    private Integer sellerDistrictId;

    /**
     * 商家app编号
     */
    private String merchantAppCode;

    /**
     * 用户账号
     */
    private String userMobile;

    /**
     * 操作员
     */
    private String oprName;

    /**
     * 商品信息
     */
    private List<OrderItemDTO> products;

    /**
     * 外包门店id
     */
    private Long extStoreId;

    /**
     * 使用的券id集合
     */
    private List<Long> couponIds;

}
