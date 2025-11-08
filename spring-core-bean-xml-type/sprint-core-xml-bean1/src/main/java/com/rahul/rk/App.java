package com.rahul.rk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.rk.bean.Employee;

public class App {
	public static void main(String[] args) {
		String config = "\\resource\\applicationContext.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
		Employee employee = (Employee) applicationContext.getBean("emp");
		System.out.println("Employee Id : "+employee.getEmpId()+"\nEmployee Name : "+employee.getEmpName()+"\nEmployee Id : "+employee.getEmpSalary());
		applicationContext.close();
	}
}
