package com.zepto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.Employee;
import com.zepto.repository.EmpRepositpry;
import com.zepto.request.EmpRequest;
import com.zepto.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepositpry repositpry;

	@Override
	public int addEmp(EmpRequest request) {
		Employee employee = new Employee();
		employee.setEmpName(request.getEmpName());
		employee.setEmpAdd(request.getEmpAdd());
		employee.setEmpSal(request.getEmpSal());

		employee = repositpry.save(employee);

		return employee.getEmpId();
	}

	public Employee updateEmp(EmpRequest request) {
		Employee employee = repositpry.findById(request.getEmpId())
				.orElseThrow(() -> new RuntimeException("Employee not found"));
		employee.setEmpName(request.getEmpName());
		employee.setEmpAdd(request.getEmpAdd());
		employee.setEmpSal(request.getEmpSal());
		
		return repositpry.save(employee);
	}

}
