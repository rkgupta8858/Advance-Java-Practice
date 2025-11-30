package com.rahul;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.entity.Employee;

@RestController
public class MyController {
	
	@PostMapping("OrderController")
	public ResponseEntity orderController(@RequestBody Employee employee) {
		System.out.println("Name "+employee.getName());
		System.out.println("Salary "+employee.getSalary());
		return ResponseEntity.ok("Order Success");
	}
}
