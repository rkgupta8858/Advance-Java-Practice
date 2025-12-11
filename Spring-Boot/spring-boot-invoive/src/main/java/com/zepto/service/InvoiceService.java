package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.Invoice;
import com.zepto.repository.InvoiceRepo;
import com.zepto.request.InvoicerRequest;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRepo invoiceRepo;

	public int generateInvoice(InvoicerRequest invoicerRequest) {
		Invoice invoice = new Invoice();
		invoice.setItemName(invoicerRequest.getItemName());
		invoice.setDescription(invoicerRequest.getDescription());
		invoice.setPrice(invoicerRequest.getPrice());

		invoice = invoiceRepo.save(invoice);
		return invoice.getItemId();
	}

}
