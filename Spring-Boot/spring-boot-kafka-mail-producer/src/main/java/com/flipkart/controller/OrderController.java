package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.request.OrderRequest;
import com.flipkart.service.OrderProducerService;

@RestController
public class OrderController {

	@Autowired
	private OrderProducerService producerService;

	@PostMapping("/placeOrder")
	public String placeOrder(@RequestBody OrderRequest request) {
		
		System.out.println("order placed !!");
		
		producerService.sendNotification(request);
		
		return "Order Placed Successfully !! ";
	}
}
