package com.sec.cluster3eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cluster3Eureka8013Application {

    public static void main(String[] args) {
        SpringApplication.run(Cluster3Eureka8013Application.class, args);
    }

}
