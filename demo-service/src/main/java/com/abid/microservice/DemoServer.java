package com.abid.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by abidk on 12/24/15.
 */
@SpringBootApplication @EnableDiscoveryClient public class DemoServer {

	public static void main(String[] args) {
		//System.setProperty("spring.config.name", "account-server");
		SpringApplication.run(DemoServer.class, args);
	}
}
