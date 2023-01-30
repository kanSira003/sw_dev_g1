package com.example.accessingdatamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;

//@SpringBootApplication(scanBasePackages="com.example.accessingdatamysql")

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages="com.example.accessingdatamysql.controller;com.example.accessingdatamysql.service")
@SpringBootApplication(scanBasePackages="com.example.accessingdatamysql")
public class MainApplication {


	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MainApplication.class);
        final ConfigurableApplicationContext context = app.run(args);

//		System.out.println("--------------- BEAN DEFINITION ----------------");
//        for (String beanName: context.getBeanDefinitionNames()) {
//            System.out.println(beanName);
//        }
		
		// System.out.println("----------------- ENVIRONMENT ------------------");
		// Environment env = context.getEnvironment();
		// System.out.println("Started on port: " + env.getProperty("server.port"));
        	
	}


}
