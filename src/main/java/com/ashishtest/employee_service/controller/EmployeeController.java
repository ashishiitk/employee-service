package com.ashishtest.employee_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashishtest.employee_service.entity.Employee;
import com.ashishtest.employee_service.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@RefreshScope
public class EmployeeController {

	@Autowired 
	private EmployeeService employeeService;
	
	@Value("9085")	
	private String port;
	
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Long id ) {
		return employeeService.findEmployeeById(id);
	}
	
	@GetMapping("/dept/{id}")
	public List<Employee> getEmployeeByDeptId(@PathVariable Long id ) {
		System.out.println("getting employee from port "+port);
		return employeeService.findEmployeebyDeptId(id);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return employeeService.findAllEmployee();
	}
}
