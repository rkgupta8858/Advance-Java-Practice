package com.kodewala.service;

import com.kodewala.entity.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int empId);
}
