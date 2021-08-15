package com.laishu.microservice.ItemPriceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-price")
public class ItemPriceController {

	@GetMapping("/price")
	public String getItemPrice() {
		return "1092";
	}
}
