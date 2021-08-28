package com.sec.cluster1eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cluster1Eureka8011Application {

    public static void main(String[] args) {
        SpringApplication.run(Cluster1Eureka8011Application.class, args);
    }

}
