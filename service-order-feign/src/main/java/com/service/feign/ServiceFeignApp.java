package com.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Mr.PanYang on 2018/8/1.
 */
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class ServiceFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApp.class, args);
    }
}
