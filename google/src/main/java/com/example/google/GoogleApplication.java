package com.example.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleApplication.class, args);
	}

}
