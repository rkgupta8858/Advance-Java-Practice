package com.rahul;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rahul.entity.Payment;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("\\com\\rahul\\config\\hibernate-cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Payment payment = new Payment();
		payment.setAmount(5000);
		payment.setDescription("This is Android Phone");
		payment.setSentBy("Rahul Gupta");
		payment.setStatus("Complete");

		session.save(payment);
		transaction.commit();
	}
}
