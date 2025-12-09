package com.kodewala.dao;

import com.kodewala.entity.Employee;

public interface IEmployeeDao {
	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee getEmpById(int id);

	public void deleteEmployee(Employee employee);
}
