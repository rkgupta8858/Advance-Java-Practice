package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.entity.OrderEntity;
import com.amazon.request.OrderRequest;
import com.amazon.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/orderItem")
	public ResponseEntity orderItem(@RequestBody OrderRequest orderRequest) {
		OrderEntity orderItem = orderService.orderItem(orderRequest);
		return ResponseEntity.ok(orderItem);
	}

	@PutMapping("/updateStatus/{id}/status")
	public ResponseEntity updateStatus(@PathVariable int id, @RequestBody OrderRequest orderRequest) {
		OrderEntity orderItem = orderService.updateStatus(id, orderRequest);
		return ResponseEntity.ok(orderItem);
	}
}
