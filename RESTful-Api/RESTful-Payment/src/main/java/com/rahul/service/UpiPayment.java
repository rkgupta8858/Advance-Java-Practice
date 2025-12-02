package com.rahul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.PaymentDao;
import com.rahul.entity.PaymentTable;

@Service
public class UpiPayment implements PaymentService {

	@Autowired
	PaymentDao paymentDao;

	public UpiPayment(PaymentDao paymentDao) {
		super();
		this.paymentDao = paymentDao;
	}

	@Override
	public int pay(PaymentTable paymentTable) {
		System.out.println("UpiPayment.pay()");
		int result = paymentDao.savePayment(paymentTable);
		return result;
	}

}
