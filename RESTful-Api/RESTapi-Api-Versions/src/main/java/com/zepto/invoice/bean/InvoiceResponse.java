package com.zepto.invoice.bean;

public class InvoiceResponse {
	private int invoiceId;
	private String itemName;
	private String description;
	private double totalPrice;
	private String taxApplied;
	private String createdAt;

	public int getInvoiceId() {
		return invoiceId;
	}

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public String getTaxApplied() {
		return taxApplied;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setTaxApplied(String taxApplied) {
		this.taxApplied = taxApplied;
	}

	public void setCreatedAt(String string) {
		this.createdAt = string;
	}
	
}
