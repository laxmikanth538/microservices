package com.laishu.microservice.ItemPriceService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ItemPriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemPriceServiceApplication.class, args);
	}

}
