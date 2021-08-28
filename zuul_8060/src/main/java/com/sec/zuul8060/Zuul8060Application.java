package com.sec.zuul8060;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient//将Eureka客户端功能设置为可用
@EnableZuulProxy
public class Zuul8060Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul8060Application.class, args);
    }

}
