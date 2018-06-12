/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.mapper;

import com.yancy.order.dal.po.OrderCouponRefPO;
import com.yancy.order.dto.OrderCouponRefDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderCouponRefMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderCouponRefPO record);

    int insertSelective(OrderCouponRefPO record);

    OrderCouponRefPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCouponRefPO record);

    int updateByPrimaryKey(OrderCouponRefPO record);

    int insertOrderCouponRef(@Param("orderCouponRefDTOList") List<OrderCouponRefDTO> orderCouponRefDTOList);

    List<OrderCouponRefPO> selectByOrderId(@Param("orderId") Long orderId);
}