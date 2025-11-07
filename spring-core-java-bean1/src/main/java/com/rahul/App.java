package com.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.bean.Student;
import com.rahul.config.SprintConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SprintConfig.class);
		Student student = (Student) applicationContext.getBean("rahul");
		System.out.println("Student Id : "+student.getStudentId()+"\nStudent Name : "+student.getStudentName()+"\nStudent Salary : "+student.getStudentSal());

	}
}
