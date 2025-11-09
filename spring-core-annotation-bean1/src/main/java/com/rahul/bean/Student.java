package com.rahul.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "rahul")
public class Student {

	@Value("101")
	private int studentId;
	@Value("R. K. Gupta")
	private String studentName;
	@Value("69000.00")
	private double studentSal;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentSal() {
		return studentSal;
	}

	public void setStudentSal(double studentSal) {
		this.studentSal = studentSal;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSal=" + studentSal + "]";
	}
}
