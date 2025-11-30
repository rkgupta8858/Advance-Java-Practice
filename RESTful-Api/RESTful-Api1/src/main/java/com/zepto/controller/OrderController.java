package com.zepto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.controller.request.OrderRequest;

@RestController
public class OrderController {
	
	@PostMapping("placeOrder")
	public ResponseEntity placeOrder(@RequestBody OrderRequest orderRequest) {
		
		System.out.println("Order Details :"+ orderRequest.getItemName() + " "+ orderRequest.getItemPrice());
		return ResponseEntity.ok("order received....");
	}
}
