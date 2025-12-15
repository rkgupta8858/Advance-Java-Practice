package com.amazon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class OrderEntity {
	
	@Id
	@Column(name = "order_id")
	private int id;
	
	@Column(name = "order_status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status; 
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
