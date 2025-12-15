package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.OrderEntity;
import com.amazon.exception.OrderNotFoundException;
import com.amazon.repository.OrderRepository;
import com.amazon.request.OrderRequest;

@Service
public class OrderService {

	@Autowired
    private OrderRepository orderRepository;

    public void updateStatus(int orderId, OrderRequest orderStatus) {

        OrderEntity order = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order Not Found !!!"));

        order.setStatus(orderStatus.getStatus());

        orderRepository.save(order);
    }

}
