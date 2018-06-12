/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.commons.newresult;

import java.io.Serializable;

/**
 * 新状态码枚举
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/9/28 下午8:33 $$
 */
public interface StatusCode extends Serializable {


    int getCode();

    String getTypeDesc();

    String getDesc();

    StatusCode setDesc(String desc);
}
