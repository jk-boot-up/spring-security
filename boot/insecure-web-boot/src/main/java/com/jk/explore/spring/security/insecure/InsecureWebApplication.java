package com.jk.explore.spring.security.insecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsecureWebApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(InsecureWebApplication.class, args);
	}

}
