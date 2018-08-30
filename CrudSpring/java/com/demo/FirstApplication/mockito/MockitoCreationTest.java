package com.demo.FirstApplication.mockito;

import org.junit.Before;
import org.junit.Test;

import com.demo.FirstApplication.model.Employee;
import com.demo.FirstApplication.repository.EmployeeRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockitoCreationTest {
	private Employee employee;
	private EmployeeRepository employeeRepo;
	
	@Before
	public void setupMock() {
		employeeRepo = mock(EmployeeRepository.class);
		employee = mock(Employee.class);
	}
	
	@Test
    public void testMockCreation(){
        assertNotNull(employeeRepo);
        assertNotNull(employee);
    }

}
