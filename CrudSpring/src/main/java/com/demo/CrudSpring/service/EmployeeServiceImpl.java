package com.demo.CrudSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.CrudSpring.dao.EmployeeDao;
import com.demo.CrudSpring.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getEmpDetails()
	{
		return employeeDao.getEmpDetails();
	}
	
	public Employee getEmployeeById(int id )
	{
		Employee emp = employeeDao.getEmployeeById(id);
		return emp;
	}
	
	public String deleteEmployee(int id )
	{
		  return employeeDao.deleteEmployee(id);
	}
		 
	public String updateEmp(Employee employee)
	{
		return employeeDao.updateEmp(employee);
	}
	
	public String createEmployee(Employee employee)
	{
		return employeeDao.createEmployee(employee);
	}

	@Override
	public int getAllEmployee(Employee employee) {
		int available = employeeDao.getAllEmployee(employee);
		return available;
	}

}
