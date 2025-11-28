package com.rahul.emp.controller;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.emp.entity.Employee;
import com.rahul.emp.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/AddEmp")
	public String addEmployeeController() {
		return "addEmployeePage";

	}

	@PostMapping("addEmpPage")

	public String addEmpData(HttpServletRequest request, Model model) {

//		EmployeeService employeeService = new EmployeeService();

		String name = request.getParameter("empName");
		String email = request.getParameter("empEmail");
		String salary = request.getParameter("empSalary");
		String address = request.getParameter("empAddress");

		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpEmail(email);
		employee.setEmpSalary(salary);
		employee.setEmpAddress(address);

		int id = employeeService.addEmployee(employee);
		
		model.addAttribute("id",id);
		model.addAttribute("name",name);

		return "addEmpSuccess";

	}

	@RequestMapping("/UpdateEmp")
	public String updateEmployeeController() {
		return "updateEmployeePage";

	}

	@RequestMapping("/DeleteEmp")
	public String deleteEmployeeController() {
		return "deleteEmployeePage";

	}

	@RequestMapping("/ViewEmp")
	public String viewEmployeeController() {
		return "viewEmployeePage";
	}
}
