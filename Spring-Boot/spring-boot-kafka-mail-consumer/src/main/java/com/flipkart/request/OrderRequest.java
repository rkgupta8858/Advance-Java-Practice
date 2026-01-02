package com.flipkart.request;

public class OrderRequest {
	private String orderId;
	private String productName;
	private int quantity;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderRequest{" + "orderId='" + orderId + '\'' + ", productName='" + productName + '\'' + ", quantity="
				+ quantity + '}';
	}
}
