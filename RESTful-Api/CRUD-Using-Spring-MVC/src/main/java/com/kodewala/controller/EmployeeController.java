package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.Employee;
import com.kodewala.service.IEmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	IEmployeeService employeeService;
	
	@PostMapping("/addEmp")
	public ResponseEntity addEmpController(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return ResponseEntity.ok("Employee Added Successfully..");
	}
	@PostMapping("/updateEmp")
	public ResponseEntity updateEmpController(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return ResponseEntity.ok("Employee Updated Successfully..");
	}
	@DeleteMapping("/deleteEmp/{empId}")
	public ResponseEntity deleteEmpController(@PathVariable("empId") int empId) {
		employeeService.deleteEmployee(empId);
		return ResponseEntity.ok("Employee Deleted Successfully..");
	}
}
