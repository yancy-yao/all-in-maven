/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 新用户
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/10/21 下午1:19 $$
 */
@Getter
@Setter
public class NewUserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 平台新用户
     */
    private Boolean isPlatformNewUser;

    /**
     * 商家新用户
     */
    private Boolean isMerchantNewUser;

    /**
     * 门店新用户
     */
    private Boolean isStoreNewUser;


}
