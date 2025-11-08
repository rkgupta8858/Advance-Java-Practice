package com.rahul.rk;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for debit card \nEnter 2 for credit card");
		System.out.print("Enter Selection : ");
		int selection = scanner.nextInt();

		IPayment p;
		if (selection == 1) {
			p = new DebitCard();
		} else {
			p = new CreditCard();
		}
		PaymentService service = new PaymentService(p);
		service.doPayment(4500.00);
		
		scanner.close();
	}

}
