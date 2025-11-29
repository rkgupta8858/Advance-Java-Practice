package com.rahul.emp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahul.emp.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public int saveEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = (int) session.save(employee);
		transaction.commit();
		session.close();
		return id;
	}

	public void updateEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		session.close();
	}

	public void deleteEmployee(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = session.get(Employee.class, id);
		if (emp != null) {
			session.delete(emp);
		}

		tx.commit();
		session.close();
	}

	public List<Employee> getAllEmployees() {
		Session session = sessionFactory.openSession();
		List<Employee> list = session.createQuery("from Employee", Employee.class).list();
		session.close();
		return list;
	}

}
