package com.kpgroup.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpgroup.entity.Employee;
import com.kpgroup.repository.EmpRepository;
import com.kpgroup.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	
	@Autowired
	private EmpRepository empRepository;
	
	@Override
	public Employee createEmployee(Employee emp) {
		
		return null;
	}

	@Override
	public Employee getEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
}
