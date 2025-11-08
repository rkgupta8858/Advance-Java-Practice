package com.rahul.rk;

public class DebitCard implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("DebitCard.processPayment()");
		return true;
	}

}
