package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInitApplication {

	public static void main(String[] args) {
		//have the tomcat server and have the container
		SpringApplication.run(SpringInitApplication.class, args);
	}

}
