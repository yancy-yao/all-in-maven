/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.po;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


/**
 * 餐饮订单详情po
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/8/2 下午4:23 $$
 */
@Getter
@Setter
public class OrderItemPO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 订单id
     */
    private Long orderId;
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
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 最后修改时间
     */
    private Date gmtModified;
    /**
     * 版本
     */
    private Integer ver;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Long realPrice) {
        this.realPrice = realPrice;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getItemTotalAmount() {
        return itemTotalAmount;
    }

    public void setItemTotalAmount(Long itemTotalAmount) {
        this.itemTotalAmount = itemTotalAmount;
    }

    public Long getRealItemTotalAmount() {
        return realItemTotalAmount;
    }

    public void setRealItemTotalAmount(Long realItemTotalAmount) {
        this.realItemTotalAmount = realItemTotalAmount;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }
}