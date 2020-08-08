package com.tanerdiler.microservice.containerizedscgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContainerizedScgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerizedScgatewayApplication.class, args);
	}

}
