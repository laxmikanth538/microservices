package com.laishu.microservice.itemservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("item-price-service")
public interface ItemPriceClient {

	@GetMapping("/item-price/price")
	String getItemPrice();
}
