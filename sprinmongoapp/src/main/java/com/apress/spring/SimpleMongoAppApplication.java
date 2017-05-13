package com.apress.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@SpringBootApplication
public class SimpleMongoAppApplication {
	private static final Logger log = LoggerFactory.getLogger(SimpleMongoAppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleMongoAppApplication.class, args);
	}
}
