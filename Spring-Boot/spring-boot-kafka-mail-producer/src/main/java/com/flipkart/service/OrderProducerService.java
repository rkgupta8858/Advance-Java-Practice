package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.flipkart.request.OrderRequest;

@Service
public class OrderProducerService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final String TOPIC = "order-topic";

	public void sendNotification(OrderRequest request) {
		
		String msg = "Order Placed -> " + request.toString();
		
		
		kafkaTemplate.send(TOPIC, msg);
		System.out.println("Message send to kafka : " + msg);
	}
}
