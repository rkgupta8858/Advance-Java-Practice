package com.zepto.invoice.bean;

public class InvoiceRequestV1 {
	private String itemName;
	private String description;
	private double price;
	private double stateVat;
	private double centralVat;

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public double getStateVat() {
		return stateVat;
	}

	public double getCentralVat() {
		return centralVat;
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

	public void setStateVat(double stateVat) {
		this.stateVat = stateVat;
	}

	public void setCentralVat(double centralVat) {
		this.centralVat = centralVat;
	}
}
