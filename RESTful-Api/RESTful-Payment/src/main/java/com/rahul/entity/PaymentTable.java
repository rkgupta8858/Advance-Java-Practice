package com.rahul.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PaymentTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentRefNo;
	private String orderId;
	private String amount;
	private String status;
	private String description;

	public int getPaymentRefNo() {
		return paymentRefNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getAmount() {
		return amount;
	}

	public String getStatus() {
		return status;
	}

	public String getDescription() {
		return description;
	}

	public void setPaymentRefNo(int paymentRefNo) {
		this.paymentRefNo = paymentRefNo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
