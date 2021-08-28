package com.sec.hystrix8051;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//将Eureka客户端功能设置为可用
@EnableDiscoveryClient//将该功能处于开启状态
@EnableCircuitBreaker  //意思就是"开启容错机制（处理异常方式，将其设置为可用）"
public class Hystrix8051Application {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix8051Application.class, args);
    }

}
