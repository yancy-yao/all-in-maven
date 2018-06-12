package com.yancy.commons.sms.api;

/**
 * sms返回结果
 *
 * @author:yaoxin
 * @date:Created in 2018/6/1 10:09
 * @description:
 */
public class SmsCommonResult {
    boolean success;
    String message;
    String errorCode;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public SmsCommonResult() {
    }

    public SmsCommonResult(boolean success, String message, String errorCode) {
        this.success = success;
        this.message = message;
        this.errorCode = errorCode;
    }
}
