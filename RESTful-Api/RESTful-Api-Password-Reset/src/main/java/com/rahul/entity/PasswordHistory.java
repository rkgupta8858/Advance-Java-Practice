package com.rahul.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "password_history")
public class PasswordHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int userId;
	private String oldPassword;

	public int getId() {
		return id;
	}

	public int getUserId() {
		return userId;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserId(int useId) {
		this.userId = useId;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

}
