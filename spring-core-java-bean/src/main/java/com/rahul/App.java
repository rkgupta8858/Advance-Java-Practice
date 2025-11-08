package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.bean.Order;
import com.rahul.bean.SpringConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Order order = (Order) applicationContext.getBean("orderBean");
		System.out.println("Order Id : "+order.getOrderId()+"\nItem Name : "+order.getItemName()+"\nItem Price : "+order.getItemPrice());
	}
}
