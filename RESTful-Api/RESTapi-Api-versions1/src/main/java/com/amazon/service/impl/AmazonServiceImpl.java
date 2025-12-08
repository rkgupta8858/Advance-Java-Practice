package com.amazon.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.dao.AmazonDao;
import com.amazon.entity.Invoice;
import com.amazon.model.InvoiceResponse;
import com.amazon.model.InvoiceV1;
import com.amazon.service.AmazonService;

@Service
public class AmazonServiceImpl implements AmazonService {

	@Autowired
	AmazonDao amazonDao;

	@Override
	public InvoiceResponse generateInvoice(InvoiceV1 v1) {
		double price = v1.getPrice();
		double stateTax = price * v1.getStateVat() / 100;
		double centralTax = price * v1.getCentralVat() / 100;
		double totalPrice = price + stateTax + centralTax;

		Invoice invoice = new Invoice();
		invoice.setItemName(v1.getItemName());
		invoice.setDescription(v1.getDescription());
		invoice.setPrice(price);
		invoice.setTax("State Tax : " + v1.getStateVat() + ", Central Tax : " + v1.getCentralVat());
		invoice.setTotalPrice(totalPrice);
		invoice.setCreatedAt(LocalDateTime.now());

		amazonDao.save(invoice);		
		
		InvoiceResponse response = new InvoiceResponse();
		response.setInvoiceId(invoice.getId());
		response.setItemName(invoice.getItemName());
		response.setDescription(invoice.getDescription());
		response.setTaxApplied(invoice.getTax());
		response.setTotalPrice(invoice.getTotalPrice());
		response.setCreatedAt(invoice.getCreatedAt().toString());

		return response;
	}

}





