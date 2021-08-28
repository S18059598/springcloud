package com.sec.dashboard8050;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerDashboard8050Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashboard8050Application.class, args);
    }

}
