/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.commons.permission;

import com.alibaba.fastjson.JSON;

/**
 * 权限项枚举
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/9/28 下午8:33 $$
 */
public enum PermissionEnum {

    PAY(1, "买单收银"),
    GATHERING(2, "收款信息");


    private int code;
    private String desc;

    PermissionEnum(int code, String desc) {
        this.code = code;

        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }


    public String getDesc() {
        return this.desc;
    }

    public PermissionEnum setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
