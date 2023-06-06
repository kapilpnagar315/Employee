package com.kpgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpgroup.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{

	Employee findByCity(String city);
	
	Employee findByName(String name);
}
