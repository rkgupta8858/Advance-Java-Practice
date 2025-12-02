package com.rahul.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahul.entity.PaymentTable;

@Repository
public class PaymentDao {

	@Autowired
	SessionFactory sessionFactory;

	public int savePayment(PaymentTable paymentTable) {
		System.out.println("PaymentDao.paymentDaodb()");

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		int response = (int) session.save(paymentTable);
		transaction.commit();

		return response;
	}
}
