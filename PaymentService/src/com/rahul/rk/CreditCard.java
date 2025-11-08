package com.rahul.rk;

public class CreditCard implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("CreditCard.processPayment()");
		return true;
	}

}
