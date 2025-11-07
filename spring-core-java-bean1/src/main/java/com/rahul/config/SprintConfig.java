package com.rahul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rahul.bean.Student;

@Configuration
public class SprintConfig {
	@Bean(value = "rahul")
	public Student studentConfigBean() {
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Rahul Kumar Gupta");
		student.setStudentSal(99999.99);
		return student;
	}
}
