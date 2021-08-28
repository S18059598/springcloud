package com.sec.fegin8040;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.sec"})
public class ConsumerFeign8040Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign8040Application.class, args);
    }

}
