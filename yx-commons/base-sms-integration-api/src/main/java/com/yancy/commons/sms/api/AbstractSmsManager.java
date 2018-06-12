package com.yancy.commons.sms.api;

import java.util.Map;

/**
 * T
 *
 * @author:yaoxin
 * @date:Created in 2018/6/1 10:10
 * @description:
 */
public abstract class AbstractSmsManager {

    public SmsCommonResult sendSms(SmsTemplate smsTemplate, String phone) {
        return sendSms(smsTemplate, phone, null);
    }

    public abstract SmsCommonResult sendSms(SmsTemplate smsTemplate, String phone, Map<String, String> parms);

}
