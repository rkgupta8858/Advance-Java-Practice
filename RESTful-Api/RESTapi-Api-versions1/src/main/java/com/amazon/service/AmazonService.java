package com.amazon.service;

import com.amazon.model.InvoiceResponse;
import com.amazon.model.InvoiceV1;

public interface AmazonService {
	public InvoiceResponse generateInvoice(InvoiceV1 v1);
}
