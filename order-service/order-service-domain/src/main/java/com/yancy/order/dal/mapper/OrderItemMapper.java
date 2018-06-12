/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.mapper;

import com.yancy.order.dal.po.OrderItemPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 餐饮订单详情mapper
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/8/2 下午4:23 $$
 */
@Mapper
public interface OrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderItemPO record);

    int insertSelective(OrderItemPO record);

    OrderItemPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemPO record);

    int updateByPrimaryKey(OrderItemPO record);

    int batchInsert(List<OrderItemPO> orderItemPOList);

    List<OrderItemPO> selectByOrderId(@Param(value = "orderId") Long orderId);

    Long selectItemTotalByOrderId(Long orderId);

}