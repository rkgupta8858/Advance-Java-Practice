package com.zepto.invoice.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zepto.invoice.entity.ProductInvoice;

@Repository
public class ProductInvoiceDao {

	@Autowired
	SessionFactory sessionFactory;

	public ProductInvoice save(ProductInvoice inovice) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(inovice);
		transaction.commit();
		session.clear();
		return inovice;
	}

}
