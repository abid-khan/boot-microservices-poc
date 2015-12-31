package com.abid.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by abidk on 12/24/15.
 */
@SpringBootApplication @EnableEurekaServer public class SeriveRegistrationServer {
	public static void main(String[] args) {
		SpringApplication.run(SeriveRegistrationServer.class, args);
	}
}

