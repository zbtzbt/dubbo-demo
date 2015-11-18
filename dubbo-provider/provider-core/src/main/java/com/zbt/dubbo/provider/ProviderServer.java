package com.zbt.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.MBeanExportConfiguration;
import org.springframework.jmx.support.RegistrationPolicy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Frank Zhang on 15/11/17.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ProviderServer {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServer.class, args);
        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date())
                + " dubbo provider service server started!");
    }
}
