package com.kodewala.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.dao.IEmployeeDao;
import com.kodewala.entity.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employee addEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public void deleteEmployee(Employee employee) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(employee);
		transaction.commit();
		session.close();
	}

	@Override
	public Employee getEmpById(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		transaction.commit();
		session.close();
		return employee;
	}

}
