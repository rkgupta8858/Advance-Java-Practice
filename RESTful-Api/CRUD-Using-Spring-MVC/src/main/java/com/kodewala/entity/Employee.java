package com.kodewala.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeDetails")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private double empSal;
	private String empAddress;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
