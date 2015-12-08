package com.zbt.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Frank Zhang on 15/11/16.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DubboServer {

    public static void main(String[] args) {
        SpringApplication.run(DubboServer.class, args);
        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date())
                + " dubbo consumer service server started!");
    }
}
