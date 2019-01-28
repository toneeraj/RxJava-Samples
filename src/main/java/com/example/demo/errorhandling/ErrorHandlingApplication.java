package com.example.demo.errorhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ErrorHandlingApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "errorhandling");
		SpringApplication.run(ErrorHandlingApplication.class, args);
	}

}

