package com.zepto.invoice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice_table")
public class ProductInvoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	private String description;
	private double itemPrice;
	private String taxApplied;
	private double totalPrice;
	
	private LocalDateTime createdAt;

	public ProductInvoice() {
	}

	public int getId() {
		return id;
	}

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public String getTaxApplied() {
		return taxApplied;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void setTaxApplied(String taxApplied) {
		this.taxApplied = taxApplied;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
