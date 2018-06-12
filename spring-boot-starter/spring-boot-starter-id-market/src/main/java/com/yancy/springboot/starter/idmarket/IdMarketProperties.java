package com.yancy.springboot.starter.idmarket;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 *
 * @author:yaoxin
 * @date:Created in 2018/5/31 16:16
 * @description:
 */
@ConfigurationProperties(prefix = "spring.idmarket")
public class IdMarketProperties {

    private long workerId;

    public long getWorkerId() {
        return this.workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }
}
