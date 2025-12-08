package com.amazon.service;

import com.amazon.model.InvoiceResponse;
import com.amazon.model.InvoiceV1;
import com.amazon.model.InvoiceV2;

public interface AmazonService {
	public InvoiceResponse generateInvoice(InvoiceV1 v1);
	public InvoiceResponse generateInvoice1(InvoiceV2 v2);
}
