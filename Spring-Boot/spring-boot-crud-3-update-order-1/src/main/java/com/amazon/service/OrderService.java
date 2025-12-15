package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.OrderEntity;
import com.amazon.repository.OrderRepository;
import com.amazon.request.OrderRequest;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public OrderEntity orderItem(OrderRequest orderRequest) {
		OrderEntity entity = new OrderEntity();
		entity.setItemName(orderRequest.getItemName());
		entity.setPrice(orderRequest.getPrice());
		entity.setTime(orderRequest.getTime());
		entity.setStatus(orderRequest.getStatus());

		return orderRepository.save(entity);
	}

	public OrderEntity updateStatus(int id, OrderRequest orderRequest) {
		OrderEntity entity = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order Not Found !!"));
		entity.setStatus(orderRequest.getStatus());
		return orderRepository.save(entity);
	}
}
