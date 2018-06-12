/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.po;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单id与就餐id
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/12/8 下午3:34 $$
 */
@Getter
@Setter
public class OrderIdAndBizIdPO {
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 业务id
     */
    private Long bizId;
}
