package com.bharath.springcloud.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AuthserverApplication {

	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:jwtiscool.jks");
		SpringApplication.run(AuthserverApplication.class, args);
	}

}
