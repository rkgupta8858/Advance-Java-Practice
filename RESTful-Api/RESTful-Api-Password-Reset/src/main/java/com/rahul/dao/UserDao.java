package com.rahul.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahul.entity.PasswordHistory;
import com.rahul.entity.User;

@Repository
public class UserDao {

	@Autowired
	SessionFactory sessionFactory;

	public User getUserById(int id) {
		Session session = sessionFactory.openSession();
		User user = session.get(User.class, id);
		session.close();
		return user;
	}

	public void updatePassword(User user) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(user);
		
		transaction.commit();
		session.close();
	}

	public void saveOldPassword(PasswordHistory history) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(history);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked") 
	public List<PasswordHistory> getLastThreePasswords(int userId) {
		Session session = sessionFactory.openSession();

		List<PasswordHistory> list = session.createQuery("from PasswordHistory where userId=:uid order by id desc")
				.setParameter("uid", userId).setMaxResults(3).list();

		session.close();
		return list;
	}
}
