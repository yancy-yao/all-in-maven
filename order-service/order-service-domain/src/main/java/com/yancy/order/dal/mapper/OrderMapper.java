/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.mapper;

import com.yancy.order.dal.po.OrderIdAndBizIdPO;
import com.yancy.order.dal.po.OrderPO;
import com.yancy.order.dal.query.OrderQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.List;

/**
 * 餐饮订单mapper
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/8/2 下午4:23 $$
 */
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderPO record);

    int insertSelective(OrderPO record);

    OrderPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderPO record);

    int updateByPrimaryKey(OrderPO record);

    int closeOutOfHourNotPay(@Param("hour") Integer hour);


    int closeExpireOrderByIds(@Param("orderIds") List<Long> orderIds);


    List<OrderPO> selectPageOrderByBuyerIdAndPayStatus(@Param("accountId") Long accountId, @Param("orderType") List<Integer> orderType, @Param("page") SpringDataWebProperties.Pageable pageable, @Param("showNotPayFlag") Integer showNotPayFlag);

    OrderPO selectBuyerOrderByAccountIdAndId(@Param("accountId") Long accountId, @Param("id") Long id);

    OrderPO selectMerchantOrderByMerchantIdAndId(@Param("merchantId") Long merchantId, @Param("id") Long id);

    boolean checkByMerchantIdOrStoreIdOrAccountIdAndStatus(@Param("merchantId") Long merchantId, @Param("storeId") Long storeId, @Param("accountId") Long accountId, @Param("status") Integer status);

    int updateOrderStatus(@Param("orderId") Long orderId, @Param("status") Integer status);

    List<OrderPO> pagingByQuery(@Param("query") OrderQuery query);

    long countByQuery(@Param("query") OrderQuery query);

    int updateMerchantRealAmountByOrderId(@Param("orderId") Long orderId, @Param("merchantRealAmount") Long merchantRealAmount);

    int updateById(OrderPO record);

    List<OrderIdAndBizIdPO> selectOrderIdsByBizIds(@Param("bizIds") List<Long> bizIds);

    Long selectOrderNumByAccountId(@Param("accountId") Long accountId);

    List<OrderPO> selectOutOfHourNotPay(@Param("minute") Integer hour);

    int setOrderPaying(@Param("orderId") Long orderId);

    int setOrderRefunding(@Param("orderId") Long orderId);

    int setOrderManualLock(@Param("orderId") Long orderId);

    List<OrderPO> selectRefundingTimeOutOrder();

    List<OrderPO> selectPayingTimeOutOrder();

    OrderPO getOrderDetailByCouponId(@Param("couponId") Long couponId);

    Long selectCountByBuyerIdAndPayStatus(@Param("accountId") Long accountId, @Param("orderType") List<Integer> orderType, @Param("pageBeanPO") SpringDataWebProperties.Pageable pageBeanPO, @Param("showNotPayFlag") Integer showNotPayFlag);

}