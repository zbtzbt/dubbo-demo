/**
 * pajk.com Inc.
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package com.zbt.dubbo.consumer;

import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.zbt.dubbo.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Frank Zhang
 */
@Configuration
@EnableAutoConfiguration
public class ReferServiceConfig extends DubboBaseConfig {


    @Value("${dubbo.user.version}")
    private String userVersion;


    @Bean(autowire = Autowire.BY_NAME)
    public ConsumerConfig consumer() {
        ConsumerConfig cc = new ConsumerConfig();
        cc.setCheck(false);
        return cc;
    }

    @Bean(name = "userService", autowire = Autowire.BY_NAME)
    public ReferenceBean userService() {
        ReferenceBean rb = new ReferenceBean();
        rb.setVersion(userVersion);
        rb.setRetries(0);
        rb.setTimeout(5000);
        rb.setInterface(UserService.class);
        return rb;
    }

}
