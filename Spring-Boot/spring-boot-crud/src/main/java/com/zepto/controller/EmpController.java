package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.request.EmpRequest;
import com.zepto.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@PostMapping("/addEmp")
	public String addEmpCtrl(@RequestBody EmpRequest request) {
		int id = empService.addEmp(request);
		return "Employee Added Successfully... & Employee Id is : " + id;
	}
}
