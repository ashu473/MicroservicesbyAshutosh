package com.example.testservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Testservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(Testservice1Application.class, args);
    }

}
