package com.rahul.zepto.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.zepto.order.bean.OrderInfo;
import com.rahul.zepto.order.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping("/orderPage")
	public String showOrderPage() {
		return "order";
	}
	
	@PostMapping("/placeOrder")
	public String placeOrder(@ModelAttribute OrderInfo orderInfo, Model model) {
		int orderId = orderService.createOrder(orderInfo);
		model.addAttribute("orderId", orderId);
		return "order-success";
	}
}
