/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.commons.newresult;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/**
 * 新状态码工具类
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/9/28 下午8:33 $$
 */
public class StatusCodes {

    public static StatusCode desc(StatusCode statusCode, String desc) {
        Preconditions.checkArgument(null != statusCode, "statusCode must be not null");
        Preconditions.checkArgument(!Strings.isNullOrEmpty(desc), "desc must be not null");
        return statusCode.setDesc(desc);
    }


    public static void main(String[] args){
        System.out.println(JSON.toJSONString(desc(StatusCodeType.UNKNOWN,"未知描述")));
    }
}
