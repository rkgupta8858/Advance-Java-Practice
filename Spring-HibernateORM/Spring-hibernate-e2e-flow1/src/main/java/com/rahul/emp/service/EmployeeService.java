package com.rahul.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.emp.dao.EmployeeDao;
import com.rahul.emp.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public int addEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
}
