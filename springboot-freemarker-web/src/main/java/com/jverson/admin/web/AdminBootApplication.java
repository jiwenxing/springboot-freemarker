package com.jverson.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AdminBootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AdminBootApplication.class, args);
	}
	
}
