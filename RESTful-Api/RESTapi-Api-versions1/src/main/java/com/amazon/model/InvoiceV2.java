package com.amazon.model;

public class InvoiceV2 {

	private String itemName;
	private String description;
	private double price; 
	private double tax;

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public double getTax() {
		return tax;
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

	public void setTax(double tax) {
		this.tax = tax;
	}

}
