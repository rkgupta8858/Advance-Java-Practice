package com.rahul.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean("orderBean")
	public Order createOrderBean() {
		Order order = new Order();
		order.setOrderId(101);
		order.setItemName("Samsung");
		order.setItemPrice(5555.00);
		return order;
	}
}
