package com.yancy.gateway.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * web网关启动类
 *
 * @author:yaoxin
 * @date:Created in 2018/6/7 16:49
 * @description:
 */
@Slf4j
@EnableZuulServer
@SpringBootApplication
public class GateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
