package com.demo.CrudSpring.dao;
import java.util.List;

import com.demo.CrudSpring.model.Employee;

public interface EmployeeDao {
	
	int getAllEmployee(Employee employee);
	
	List<Employee> getEmpDetails();
	
	//List<UserDetails> getUser(int id);
	
	Employee getEmployeeById(int id );
	 
	String deleteEmployee(int id); 
	 
	String updateEmp(Employee employee);
	
	String createEmployee(Employee employee);

}
