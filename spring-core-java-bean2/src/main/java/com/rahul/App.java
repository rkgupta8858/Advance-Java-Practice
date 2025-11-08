package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.bean.Employee;
import com.rahul.config.SpringConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee = (Employee) applicationContext.getBean("rahul");
		System.out.println(employee);
	}
}
