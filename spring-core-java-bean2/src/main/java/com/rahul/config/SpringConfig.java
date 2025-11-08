package com.rahul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rahul.bean.Employee;

@Configuration
public class SpringConfig {
	
	@Bean(value = "rahul")
	public Employee springConfigBean() {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Rohit Gupta");
		employee.setEmpSal(9999.99);
		return employee;
	}

}
