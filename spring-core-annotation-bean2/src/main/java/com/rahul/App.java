package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.bean.PaymentGateway;
import com.rahul.config.SpringConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		PaymentGateway gateway = context.getBean(PaymentGateway.class);
		System.out.println(gateway);
	}
}
