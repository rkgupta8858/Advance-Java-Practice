package com.zepto.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.invoice.bean.InvoiceRequestV2;
import com.zepto.invoice.bean.InvoiceResponse;
import com.zepto.invoice.services.ProductInvoiceServiceV2;

@RestController
public class ProductInvoiceControllerV2 {

	@Autowired
	ProductInvoiceServiceV2 invoiceServiceV2;

	@PostMapping("/apiV2Invoice")
	public InvoiceResponse craeteResponse(@RequestBody InvoiceRequestV2 requestV2) {
		return invoiceServiceV2.generateInvoice(requestV2);
	}
}
