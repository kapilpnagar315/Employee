package com.kpgroup.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name",nullable = false,length = 100)
	private String name;
	
	@Column(name="city",nullable = false,length = 100)
	private String city;
	
	@Column(name="salary",nullable = false,length = 100)
	private String salary;
	
	@Column(name="department",nullable = false,length = 100)
	private String dept;
	
	@OneToMany(mappedBy = "employee",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Project>projects=new ArrayList<>();

	
	
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String name, String city, String salary, String dept, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.dept = dept;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", dept=" + dept
				+ ", projects=" + projects + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
