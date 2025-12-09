package com.kodewala.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.dao.IEmployeeDao;
import com.kodewala.entity.Employee;
import com.kodewala.exception.EmployeeNotFoundException;
import com.kodewala.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee employee) {

		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		Employee existEmp = employeeDao.getEmpById(employee.getEmpId());
		if (existEmp == null) {
			throw new EmployeeNotFoundException("Employee Not Found : " + employee.getEmpId());
		}

		return employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		Employee existEmp = employeeDao.getEmpById(empId);
		if (existEmp == null) {
			throw new EmployeeNotFoundException("Employee Not Found : " + empId);
		}
		
		employeeDao.deleteEmployee(existEmp);
	}

}
