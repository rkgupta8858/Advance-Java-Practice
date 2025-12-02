package com.rahul.service;

import org.springframework.stereotype.Service;

import com.rahul.entity.PaymentTable;

@Service
public interface PaymentService {
	public int pay(PaymentTable paymentTable);
}
