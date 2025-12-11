package com.zepto.repository;

import org.springframework.data.repository.CrudRepository;

import com.zepto.entity.Employee;

public interface EmpRepositpry extends CrudRepository<Employee, Integer>{
	
}
