package com.ashishtest.employee_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private Long deptId;
}
