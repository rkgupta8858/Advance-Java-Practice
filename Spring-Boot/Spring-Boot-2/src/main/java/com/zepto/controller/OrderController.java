package com.zepto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zepto.SpringBoot2Application;
import com.zepto.bean.OrderRequest;

@RestController
public class OrderController {

    private final SpringBoot2Application springBoot2Application;

    OrderController(SpringBoot2Application springBoot2Application) {
        this.springBoot2Application = springBoot2Application;
    }
	@GetMapping("orderItem")
	public ResponseEntity order(@RequestBody OrderRequest orderRequest) {
		System.out.println("Item Name : "+ orderRequest.getItemName());
		System.out.println("Item Description : "+ orderRequest.getDesc());
		System.out.println("Item Price : "+ orderRequest.getPrice());
		System.out.println("==========================");
		return ResponseEntity.ok("Order Placed Successfully...");
	}
}
