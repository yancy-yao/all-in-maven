/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.commons.results;

/**
 * 公用状态定义
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/6 上午9:31 $$
 */
public interface CommonStateCodes {
    StateCode SUCCESS = StateCode.newBuilder().code(0L).desc("successful").build();

    // 网关异常码定义,业务方不要使用
    StateCode GATEWAY_SYSTEM_ERROR = StateCode.newBuilder().code(10001L).desc("系统内部错误").build();
    StateCode GATEWAY_RPC_ERROR = StateCode.newBuilder().code(10002L).desc("RPC error").build();
    StateCode GATEWAY_INNER_CALL_TIMEOUT_ERROR = StateCode.newBuilder().code(10003L).desc("调用超时").build();
    StateCode GATEWAY_API_NOT_FOUND_ERROR = StateCode.newBuilder().code(10004L).desc("不存在的api").build();
    StateCode GATEWAY_MISS_REQUIRED_PARAMETER_ERROR = StateCode.newBuilder().code(10005L).desc("缺失必须参数").build();
    StateCode GATEWAY_MISS_ACCESS_TOKEN_PARAMETER_ERROR = StateCode.newBuilder().code(10006L).desc("缺失access_token参数").build();
    StateCode GATEWAY_MISS_APP_ID_PARAMETER_ERROR = StateCode.newBuilder().code(10007L).desc("缺失app_id参数").build();
    StateCode GATEWAY_MISS_SIGN_PARAMETER_ERROR = StateCode.newBuilder().code(10008L).desc("缺失sign参数").build();
    StateCode GATEWAY_MISS_TIMESTAMP_PARAMETER_ERROR = StateCode.newBuilder().code(10009L).desc("缺失timestamp参数").build();
    StateCode GATEWAY_MISS_API_PARAMETER_ERROR = StateCode.newBuilder().code(10010L).desc("缺失api参数").build();
    StateCode GATEWAY_MISS_VER_PARAMETER_ERROR = StateCode.newBuilder().code(10011L).desc("缺失ver参数").build();
    StateCode GATEWAY_INVALID_ACCESS_TOKEN_ERROR = StateCode.newBuilder().code(10012L).desc("无效的access_token").build();
    StateCode GATEWAY_INVALID_ACCESS_TOKEN_TIMEDOUT_ERROR = StateCode.newBuilder().code(10013L).desc("access_token已过期").build();
    StateCode GATEWAY_INVALID_SIGN_ERROR = StateCode.newBuilder().code(10014L).desc("无效的sign").build();
    StateCode GATEWAY_INVALID_SIGN_TIMEDOUT_ERROR = StateCode.newBuilder().code(10015L).desc("timestamp已过期").build();
    StateCode GATEWAY_INVALID_TIMESTAMP_ERROR = StateCode.newBuilder().code(10016L).desc("无效的timestamp").build();
    StateCode GATEWAY_INVALID_APP_ID_ERROR = StateCode.newBuilder().code(10017L).desc("无效的app_id").build();

    //example
    StateCode INNER_SERVER_ERROR = StateCode.newBuilder().code(100000000000997L).desc("非正常的内部服务").build();
    StateCode SERVERS_LINK_ERROR = StateCode.newBuilder().code(100000000000998L).desc("服务器间通信异常").build();
    StateCode OTHER_SERVER_ERROR = StateCode.newBuilder().code(100000000000999L).desc("亲，服务器君又开小差了.您放心，我们的程序猿正批评教育之").build();

    //业务异常码,只定义类别,详情通过desc描述
    StateCode BIZ_UNKNOWN_ERROR = StateCode.newBuilder().code(27001L).desc("业务未知错误").build();
    StateCode BIZ_PARAMETER_MISS_ERROR = StateCode.newBuilder().code(27002L).desc("参数[%s]缺失").build();
    StateCode BIZ_PARAMETER_INVALID_ERROR = StateCode.newBuilder().code(27003L).desc("参数[%s]无效").build();
    StateCode BIZ_DATA_NOT_FOUND_ERROR = StateCode.newBuilder().code(27004L).desc("数据不存在").build();
    StateCode BIZ_OPTIMISTIC_LOCK_ERROR = StateCode.newBuilder().code(27005L).desc("乐观锁错误").build();
    StateCode BIZ_STATE_INVALID_ERROR = StateCode.newBuilder().code(27006L).desc("状态非法").build();
    StateCode BIZ_COMMON_INVALID_ERROR = StateCode.newBuilder().code(27007L).desc("业务通用错误").build();
    StateCode BIZ_RPC_ERROR = StateCode.newBuilder().code(27008L).desc("业务远程调用错误").build();
    StateCode BIZ_DB_ERROR = StateCode.newBuilder().code(27009L).desc("数据库错误").build();
    StateCode BIZ_NETWORK_ERROR = StateCode.newBuilder().code(27010L).desc("网络错误").build();
    StateCode BIZ_VERCODE_INVALID_ERROR = StateCode.newBuilder().code(27011L).desc("验证码非法").build();
    StateCode BIZ_MOBILE_ALREADY_EXIST_ERROR = StateCode.newBuilder().code(27012L).desc("手机号码已经存在").build();
    StateCode BIZ_TABLE_NOT_FOUND_ERROR = StateCode.newBuilder().code(27013L).desc("餐位不存在").build();
    StateCode BIZ_PERMISSION_INVALID_ERROR = StateCode.newBuilder().code(27014L).desc("权限无效").build();
    StateCode BIZ_MOBILE_MUTIL_EXIST_ERROR = StateCode.newBuilder().code(27015L).desc("手机号码已经多个绑定").build();

}
