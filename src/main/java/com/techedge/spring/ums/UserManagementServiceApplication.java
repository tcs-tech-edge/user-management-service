package com.techedge.spring.ums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserManagementServiceApplication extends SpringBootServletInitializer {

	private static  final Logger LOGGER = LoggerFactory.getLogger(UserManagementServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserManagementServiceApplication.class, args);
		System.getenv().forEach((key,value)-> LOGGER.debug("{} -> {}", key,value));
	}

}
