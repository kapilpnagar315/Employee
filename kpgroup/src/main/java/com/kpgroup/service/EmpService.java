package com.kpgroup.service;

import java.util.List;

import com.kpgroup.entity.Employee;

public interface EmpService {

	Employee createEmployee(Employee emp);
	
	Employee getEmployeeId(Integer id);
	
	Employee updateEmployee(Employee emp);
	
	List<Employee> getAllEmployees();
	
	void deleteEmployee(Integer id);
	
	
}
