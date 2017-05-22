package com.apress.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimpleMongoAppApplication {

    private static final Logger log = LoggerFactory.getLogger(SimpleMongoAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SimpleMongoAppApplication.class, args);
    }
}
