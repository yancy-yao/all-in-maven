/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.query;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单查询条件
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/10/26 下午2:46 $$
 */
@Getter
@Setter
public class OrderQuery implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 商户id
     */
    private Long merchantId;
    /**
     * 页数
     */
    private Integer page;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 门店id
     */
    private Long storeId;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 显示类型(1:订单支付,2:现金支付,3:扫码支付)
     */
    private Integer vType;
    /**
     * 支付类型
     */
    private List<Integer> payTypes;

    /**
     * 订单类型
     */
    private List<Integer> orderTypes;

    /**
     * 支付状态
     */
    private Integer payStatus = 1;

    /**
     * 订单状态
     */
    private Integer status = 1;

    public Integer getOffset() {
        if (null == page) {
            page = 0;
        }
        if (null == pageSize) {
            pageSize = 200;
        }
        return page * pageSize;
    }

}
