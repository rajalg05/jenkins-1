package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkins1Application {

	public static Logger logger = LoggerFactory.getLogger("JenkinsApplication");
	
	@PostConstruct
	public void init() {
		logger.info("App started");
	}
	public static void main(String[] args) {
		logger.info("App executed");
		SpringApplication.run(Jenkins1Application.class, args);
	}


}
