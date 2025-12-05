package com.zepto.invoice.bean;

public class InvoiceRequestV2 {
	private String itemName;
	private String description;
	private double price;
	private double gst;

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public double getGst() {
		return gst;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}
}
