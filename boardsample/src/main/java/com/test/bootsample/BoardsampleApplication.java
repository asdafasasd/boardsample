package com.test.bootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.test")
public class BoardsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardsampleApplication.class, args);
	}
}
