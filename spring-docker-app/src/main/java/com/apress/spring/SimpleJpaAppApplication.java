package com.apress.spring;

import com.apress.spring.service.JournalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleJpaAppApplication {

    private static final Logger log = LoggerFactory.getLogger(SimpleJpaAppApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SimpleJpaAppApplication.class);
        app.setWebEnvironment(true);
        app.run(args);
//		SpringApplication.run(SimpleJpaAppApplication.class, args);
    }
}
