package com.example.storeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StoreserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreserviceApplication.class, args);
    }

}
