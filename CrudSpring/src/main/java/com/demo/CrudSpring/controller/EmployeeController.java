package com.demo.CrudSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.CrudSpring.model.Employee;
import com.demo.CrudSpring.service.EmployeeService;


@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/listOfEmployee", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> empDetails()
	{        
		List<Employee> empDetails = employeeService.getEmpDetails();
		return new ResponseEntity<List<Employee>>(empDetails, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/Emp/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id)
	{
		Employee emp = employeeService.getEmployeeById(id);
		if (emp == null)
		{
			return new ResponseEntity<Employee>(emp,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	 }
	
	@RequestMapping(value = "/emp/delete/{id}", method = RequestMethod.DELETE)
	 public ResponseEntity<Employee> deleteEmp(@PathVariable("id") int id)
	{
		Employee emp = employeeService.getEmployeeById(id);
		if (emp == null)
		{
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	  employeeService.deleteEmployee(id);
	  return new ResponseEntity<Employee>( HttpStatus.NO_CONTENT);
	 }	

	 @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	 public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee)
	 {
		 Employee isExist = employeeService.getEmployeeById(id);
		 if (isExist == null)
		 {   
				 return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		 }
		 else if (employee == null)
		 {
			 return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
		 }
	  employeeService.updateEmp(employee);
	  return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "/persistEmp", method = RequestMethod.POST)
	 public ResponseEntity < Employee > persistPerson(@RequestBody Employee employee)
	 {
		 if (employee == null)
		 {
			 return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
		 }
	    employeeService.createEmployee(employee);
	    return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);  	   
	}
}
