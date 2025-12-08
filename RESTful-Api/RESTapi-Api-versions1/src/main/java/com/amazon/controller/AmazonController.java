package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.model.InvoiceResponse;
import com.amazon.model.InvoiceV1;
import com.amazon.model.InvoiceV2;
import com.amazon.service.AmazonService;

@RestController
public class AmazonController {

	@Autowired
	AmazonService amazonService;

	@PostMapping("/apiV1")
	public InvoiceResponse createResponse(@RequestBody InvoiceV1 v1) {
		return amazonService.generateInvoice(v1);
	}

	@PostMapping("/apiV2")
	public InvoiceResponse createResponse1(@RequestBody InvoiceV2 v2) {
		return amazonService.generateInvoice1(v2);
	}

}
