package com.demo.CrudSpring.service;

import java.util.List;

import com.demo.CrudSpring.model.Employee;



public interface EmployeeService {
	int getAllEmployee(Employee employee);

	List<Employee> getEmpDetails();	
	
	Employee getEmployeeById(int id );
		 
	String deleteEmployee(int id); 
		 
	String updateEmp(Employee employee);
		
	String createEmployee(Employee employee);
}
