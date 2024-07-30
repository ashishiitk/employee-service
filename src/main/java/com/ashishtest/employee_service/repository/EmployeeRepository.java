package com.ashishtest.employee_service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashishtest.employee_service.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	Optional<Employee> findById(Long id);
	List<Employee> findByDeptId(Long id);
	List<Employee> findAll();
	Employee save(Employee emp);
	

}
