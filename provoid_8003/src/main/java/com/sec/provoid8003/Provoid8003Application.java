package com.sec.provoid8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//将Eureka客户端功能设置为可用
@EnableDiscoveryClient//将该功能处于开启状态
public class Provoid8003Application {

    public static void main(String[] args) {
        SpringApplication.run(Provoid8003Application.class, args);
    }

}
