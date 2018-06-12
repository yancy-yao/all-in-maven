/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.boot.dubbo.health;

/**
 * dubbo 健康监控
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/19 上午10:02 $$
 */
/*
@Component
public class DubboHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        for (ClassIdBean classIdBean : ConsumerSubscribeListener.SUBSCRIBEDINTERFACES_SET) {
            Object service = DubboConsumerAutoConfiguration.DUBBO_REFERENCES_MAP.get(classIdBean);
            EchoService echoService = (EchoService) service;
            if (echoService != null) {
                echoService.$echo("Hello");
                builder.withDetail(classIdBean.toString(), true);
            }
        }
        builder.up();
    }

}
*/
