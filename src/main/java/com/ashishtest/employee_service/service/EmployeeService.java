package com.ashishtest.employee_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashishtest.employee_service.entity.Employee;
import com.ashishtest.employee_service.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public List<Employee> findEmployeebyDeptId(Long id) {
		return employeeRepository.findByDeptId(id);
	}
	
	public Optional<Employee> findEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
