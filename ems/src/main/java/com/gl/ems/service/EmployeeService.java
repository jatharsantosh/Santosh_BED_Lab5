package com.gl.ems.service;

import java.util.List;

import com.gl.ems.entity.Employee;

public interface EmployeeService {

	Employee insertEmployee(Employee employee);

	void deleteEmployeeById(int id);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	Employee updateEmployee(Employee e);

	
}