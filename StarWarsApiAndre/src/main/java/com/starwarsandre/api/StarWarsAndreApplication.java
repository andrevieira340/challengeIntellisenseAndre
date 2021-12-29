package com.starwarsandre.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StarWarsAndreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarWarsAndreApplication.class, args);
	}
	
	//managed bean main for application
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
