package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.request.InvoicerRequest;
import com.zepto.service.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;

	@PostMapping("/invoiceGenerate")
	public String invoiceCtrl(@RequestBody InvoicerRequest invoicerRequest) {

		int invoiceId = invoiceService.generateInvoice(invoicerRequest);
		return "Invoice Generated... Invoice Id : " + invoiceId;
	}
}
