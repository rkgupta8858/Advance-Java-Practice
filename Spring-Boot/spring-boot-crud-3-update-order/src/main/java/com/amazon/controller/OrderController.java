package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PutMapping("/orders/{orderId}/status")
	public ResponseEntity<String> updateOrderStatus(@PathVariable int orderId, @RequestBody String orderStatus) {

		orderService.updateStatus(orderId, orderStatus);
		return ResponseEntity.ok("Order status updated successfully");
	}

}
