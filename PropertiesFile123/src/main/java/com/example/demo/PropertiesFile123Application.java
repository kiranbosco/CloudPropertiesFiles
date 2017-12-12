package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PropertiesFile123Application {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesFile123Application.class, args);
	}
}
