package com.zepto.controller;

import java.util.List;
import com.zepto.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.entity.Employee;
import com.zepto.request.EmpRequest;
import com.zepto.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

//	@PostMapping("/addEmp")
//	public String addEmpCtrl(@RequestBody EmpRequest request) {
//		int id = empService.addEmp(request);
//		return "Employee Added Successfully... & Employee Id is : " + id;
//	}
	@PostMapping("/addEmp")
	public ResponseEntity addEmpCtrl(@RequestBody EmpRequest request) {
		int id = empService.addEmp(request);
		
		Employee employee = empService.getEmpById(id);
		return ResponseEntity.ok(employee);
	}
	
	@PutMapping("/updateEmp")
	public ResponseEntity updateEmp(@RequestBody EmpRequest request) {
		return ResponseEntity.ok(empService.updateEmp(request));
	}
	

	@DeleteMapping("/deleteEmp/{empId}")
	public ResponseEntity deleteEmpCtrl(@PathVariable("empId") int id) {
		empService.deleteEmp(id);
		return ResponseEntity.ok("Employee Deleted Successfully....");
	}
	
	@GetMapping("/getEmp/{empId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("empId") int id) {
        return ResponseEntity.ok(empService.getEmpById(id));
    }
	
	@GetMapping("/getAllEmp")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		return ResponseEntity.ok(empService.getAllEmployees());
	}
	
	
}
