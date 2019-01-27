package com.springboot.average;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springboot.average")
public class AverageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AverageServiceApplication.class, args);
	}
}