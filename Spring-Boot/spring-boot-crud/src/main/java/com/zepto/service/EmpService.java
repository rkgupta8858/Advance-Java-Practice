package com.zepto.service;

import com.zepto.entity.Employee;
import com.zepto.request.EmpRequest;

public interface EmpService {
	public int addEmp(EmpRequest request);

	public Employee updateEmp(EmpRequest request);
}
