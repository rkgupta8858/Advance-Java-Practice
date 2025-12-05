package com.zepto.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.invoice.bean.InvoiceRequestV1;
import com.zepto.invoice.bean.InvoiceResponse;
import com.zepto.invoice.services.ProductInvoiceServiceV1;

@RestController
public class ProductInvoiceControllerV1 {

	@Autowired
	ProductInvoiceServiceV1 invoiceServiceV1;

	@PostMapping("/apiV1Invoice")
	public InvoiceResponse craeteResponse(@RequestBody InvoiceRequestV1 requestV1) {
		return invoiceServiceV1.generateInvoice(requestV1);
	}
}
