package com.yancy.order;

import com.yancy.commons.results.DubboResult;
import com.yancy.order.dto.NewUserDTO;

/**
 *  获取新用户
 *
 * @author:yaoxin
 * @date:Created in 2018/6/11 14:36
 * @description:
 */
public interface NewUserApi {

    /**
     * 获取新用户信息
     *
     * @param merchantId 商家id
     * @param storeId    门店id
     * @param accountId  账号id
     * @return 新用户信息
     */
    DubboResult<NewUserDTO> getNewUser(Long merchantId, Long storeId, Long accountId);
}
