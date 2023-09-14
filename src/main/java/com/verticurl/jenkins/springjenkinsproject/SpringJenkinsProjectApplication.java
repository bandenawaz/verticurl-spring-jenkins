package com.verticurl.jenkins.springjenkinsproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsProjectApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

	public void init() {
		
		logger.info("Application Started");
	}

	public static void main(String[] args) {

		logger.info("application executed...");
		SpringApplication.run(SpringJenkinsProjectApplication.class, args);

		//System.out.println("Welcome to Verticurl FLT Programme");
	}

}
