package com.zepto.invoice.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.invoice.bean.InvoiceRequestV1;
import com.zepto.invoice.bean.InvoiceResponse;
import com.zepto.invoice.dao.ProductInvoiceDao;
import com.zepto.invoice.entity.ProductInvoice;

@Service
public class ProductInvoiceServiceV1 {

	@Autowired
	ProductInvoiceDao invoiceDao;

	public InvoiceResponse generateInvoice(InvoiceRequestV1 requestV1) {
		double price = requestV1.getPrice();
		double stateTax = price * requestV1.getStateVat() / 100;
		double centralTax = price * requestV1.getCentralVat() / 100;
		double totalPrice = price + stateTax + centralTax;

		ProductInvoice invoice = new ProductInvoice();
		invoice.setItemName(requestV1.getItemName());
		invoice.setDescription(requestV1.getDescription());
		invoice.setItemPrice(price);
		invoice.setTaxApplied(
				"Vat(State: " + requestV1.getStateVat() + ", Central: " + requestV1.getCentralVat() + ")");
		invoice.setTotalPrice(totalPrice);
		invoice.setCreatedAt(LocalDateTime.now());

		invoiceDao.save(invoice);

		InvoiceResponse invoiceResponse = new InvoiceResponse();
		invoiceResponse.setInvoiceId(invoice.getId());
		invoiceResponse.setItemName(invoice.getItemName());
		invoiceResponse.setDescription(invoice.getDescription());
		invoiceResponse.setTotalPrice(invoice.getTotalPrice());
		invoiceResponse.setTaxApplied(invoice.getTaxApplied());
		invoiceResponse.setCreatedAt(invoice.getCreatedAt().toString());

		return invoiceResponse;
	}
}
