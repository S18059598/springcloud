package com.sec.consumer_8030;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@SpringCloudApplication
public class Consumer8030Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer8030Application.class, args);
    }

}
