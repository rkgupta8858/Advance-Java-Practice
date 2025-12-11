package com.zepto.service;

import java.util.List;

import com.zepto.entity.Employee;
import com.zepto.request.EmpRequest;

public interface EmpService {
	public int addEmp(EmpRequest request);

	public Employee updateEmp(EmpRequest request);

	public void deleteEmp(int id);

	Employee getEmpById(int id);

	List<Employee> getAllEmployees();

}
