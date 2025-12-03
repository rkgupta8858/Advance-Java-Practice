package com.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.entity.PaymentTable;
import com.rahul.request.PaymentRequest;
import com.rahul.service.PaymentService;

@RestController
public class PaymentController {

	@Qualifier("upiPayment")
	@Autowired
	PaymentService paymentService;

	@PostMapping("confirmPayment")
	public ResponseEntity confirmPayment(@RequestBody PaymentRequest paymentRequest) {
		PaymentTable paymentTable = new PaymentTable();

		paymentTable.setOrderId(paymentRequest.getOrderId());
		paymentTable.setAmount(paymentRequest.getAmount());
		paymentTable.setStatus(paymentRequest.getStatus());
		paymentTable.setDescription(paymentRequest.getDescription());

		int response = paymentService.pay(paymentTable);
		return ResponseEntity.ok(response);
	}
}
