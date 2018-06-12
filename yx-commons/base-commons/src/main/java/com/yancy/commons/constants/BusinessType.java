/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.commons.constants;

/**
 * 业务类型常量
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2018/1/25 下午5:03 $$
 */
public final class BusinessType {

    public static final Long DEDUCTION_CONSUME = 1L;//订单抵扣消费
    public static final Long REVOKE = 2L;//撤回
    public static final Long COUPON_GIVE_OUT_PLATFORM_HANDLING_FEE = 51L;//卖券平台手续费
    public static final Long COUPON_USE_DISTRIBUTOR_AWARD = 52L;//卖券分销商核销奖励
    public static final Long COUPON_USE_DISTRIBUTOR_PROFIT = 53L;//卖券分销商利润
    public static final Long COUPON_GIVE_OUT_MERCHANT_COST = 54L;//卖券商家成本
    public static final Long COUPON_USE_DISTRIBUTOR_HANDLING_FEE = 55L;//卖券分销商手续费


    private BusinessType() {

    }


}
