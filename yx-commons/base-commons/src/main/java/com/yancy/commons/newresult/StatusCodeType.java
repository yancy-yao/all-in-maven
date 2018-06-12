/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.commons.newresult;

import com.alibaba.fastjson.JSON;

/**
 * 新状态码枚举
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/9/28 下午8:33 $$
 */
public enum StatusCodeType implements StatusCode {

    UNKNOWN(601, "未知"),
    UNKNOWN1(602, "未知"),
    UNKNOWN2(603, "未知"),
    UNKNOWN3(604, "未知"),
    UNKNOWN4(605, "未知"),
    UNKNOWN5(606, "未知");


    private int code;
    private String typeDesc;
    private String desc;

    StatusCodeType(int code, String typeDesc) {
        this.code = code;

        this.typeDesc = typeDesc;
    }

    public int getCode() {
        return this.code;
    }


    public String getTypeDesc() {
        return this.typeDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public StatusCode setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
