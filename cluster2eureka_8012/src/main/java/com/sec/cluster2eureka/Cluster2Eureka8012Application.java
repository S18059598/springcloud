package com.sec.cluster2eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cluster2Eureka8012Application {

    public static void main(String[] args) {
        SpringApplication.run(Cluster2Eureka8012Application.class, args);
    }

}
