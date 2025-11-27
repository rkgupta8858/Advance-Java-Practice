package com.rahul.zepto.order.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahul.zepto.order.entity.Order;

@Repository
public class OrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	public int saveOrder(Order orderEntity) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Integer response = (Integer) session.save(orderEntity);
		transaction.commit();
		return response;
	}

}
