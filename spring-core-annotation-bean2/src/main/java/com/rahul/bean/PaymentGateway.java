package com.rahul.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

	@Value("100")
	private int balance;

	public void setBalance(int balance) {
		this.balance=balance;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "PaymentGateway [balance=" + balance + "]";
	}
	

}
