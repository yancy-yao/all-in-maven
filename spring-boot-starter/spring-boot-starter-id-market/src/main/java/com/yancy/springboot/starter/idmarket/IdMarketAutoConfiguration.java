package com.yancy.springboot.starter.idmarket;

import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * 全局锁自动配置类
 *
 * @author:yaoxin
 * @date:Created in 2018/5/31 16:18
 * @description:
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(IdMarketProperties.class)
public class IdMarketAutoConfiguration {

    @Autowired
    private IdMarketProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public IdMarket idMarket() {
        //Preconditions.checkArgument(null != properties);
        //Preconditions.checkArgument(properties.getWorkerId() > 0L);
        //IdMarket idMarket = new IdMarketImpl(properties.getWorkerId());

        Preconditions.checkArgument(null != properties);
        Preconditions.checkArgument(genWorkerId() > 0L);
        IdMarket idMarket = new IdMarketImpl(genWorkerId());

        IdMarkets.setIdMarket(idMarket);
        return idMarket;
    }


    private Long genWorkerId() {
        Random random = new Random();
        int i = 0;
        while (i == 0) {
            i = random.nextInt(62);
            log.info("worker id: " + String.valueOf(i));
        }
        return Long.parseLong(String.valueOf(i));
    }

}
