package com.heroku.campfire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CampfireApplication {

	public static void main(String[] args) {
		System.out.println("Hello from my app!");
		SpringApplication.run(CampfireApplication.class, args);
	}
}
