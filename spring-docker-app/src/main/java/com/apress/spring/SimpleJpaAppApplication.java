package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleJpaAppApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SimpleJpaAppApplication.class);
        app.setWebEnvironment(true);
        app.run(args);
    }
}
