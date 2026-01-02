package com.flipkart.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.flipkart.request.OrderRequest;

import tools.jackson.databind.ObjectMapper;

@Service
public class NotificationConsumerService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "order-topic")
    public void consume(String message) {   // MUST be String

        try {
            // Convert JSON String → OrderRequest
            OrderRequest request =
                    objectMapper.readValue(message, OrderRequest.class);

            System.err.println(" Notification Received");
            System.err.println("Order Id   : " + request.getOrderId());
            System.err.println("Product    : " + request.getProductName());
            System.err.println("Quantity   : " + request.getQuantity());

        } catch (Exception e) {
            System.err.println(" Failed to deserialize message: " + message);
            e.printStackTrace();
        }
    }
}
