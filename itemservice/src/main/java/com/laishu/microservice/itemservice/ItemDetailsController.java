package com.laishu.microservice.itemservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/item-service")
public class ItemDetailsController {

	@Autowired
	ItemRepository itemRepo;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ItemPriceClient priceClient;

	@GetMapping("/item")
	public Item getItemDetails() {
		Item item = new Item();

		item.setItemName("Lark Special item");
		item.setItemAvailability("A");
		item.setItemPrice(null);

		Item response = itemRepo.save(item);

		//String itemPrice = restTemplate.getForObject("http://localhost:8092/item-price/price", String.class);
		String itemPrice = priceClient.getItemPrice();
		response.setItemPrice(itemPrice);

		return response;
	}
}
