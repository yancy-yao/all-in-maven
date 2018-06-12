/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.mapper;

import com.yancy.order.dal.po.DuplicateOrderRemovalPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DuplicateOrderRemovalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DuplicateOrderRemovalPO record);

    int insertSelective(DuplicateOrderRemovalPO record);

    DuplicateOrderRemovalPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DuplicateOrderRemovalPO record);

    int updateByPrimaryKey(DuplicateOrderRemovalPO record);

    int insertIfNotExist(@Param(value = "repastId") Long repastId, @Param(value = "bespeakId") Long bespeakId);

    int deleteOverDays(@Param(value = "day") int day);
}