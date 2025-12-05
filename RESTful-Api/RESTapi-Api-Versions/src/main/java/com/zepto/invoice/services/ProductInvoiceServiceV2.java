package com.zepto.invoice.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.invoice.bean.InvoiceRequestV2;
import com.zepto.invoice.bean.InvoiceResponse;
import com.zepto.invoice.dao.ProductInvoiceDao;
import com.zepto.invoice.entity.ProductInvoice;

@Service
public class ProductInvoiceServiceV2 {

	@Autowired
	ProductInvoiceDao invoiceDao;

	public InvoiceResponse generateInvoice(InvoiceRequestV2 requestV2) {

		double price = requestV2.getPrice();
		double gst = price * price / 100;
		double totalPrice = price = gst;

		ProductInvoice invoice = new ProductInvoice();
		invoice.setItemName(requestV2.getItemName());
		invoice.setDescription(requestV2.getDescription());
		invoice.setItemPrice(price);
		invoice.setTaxApplied("GST : " + requestV2.getGst());
		invoice.setTotalPrice(totalPrice);
		invoice.setCreatedAt(LocalDateTime.now());

		invoiceDao.save(invoice);

		InvoiceResponse response = new InvoiceResponse();
		response.setInvoiceId(invoice.getId());
		response.setItemName(invoice.getItemName());
		response.setDescription(invoice.getDescription());
		response.setTotalPrice(invoice.getTotalPrice());
		response.setTaxApplied(invoice.getTaxApplied());
		response.setCreatedAt(invoice.getCreatedAt().toString());

		return response;
	}

}
