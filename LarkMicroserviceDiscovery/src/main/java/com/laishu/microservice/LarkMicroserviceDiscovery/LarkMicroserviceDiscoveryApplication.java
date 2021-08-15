package com.laishu.microservice.LarkMicroserviceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LarkMicroserviceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LarkMicroserviceDiscoveryApplication.class, args);
	}

}
