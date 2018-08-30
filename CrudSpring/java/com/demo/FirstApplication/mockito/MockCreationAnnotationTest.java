package com.demo.FirstApplication.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.demo.FirstApplication.model.Employee;
import com.demo.FirstApplication.repository.EmployeeRepository;

public class MockCreationAnnotationTest {
	
	@Mock
    private Employee employee;
    @Mock
    private EmployeeRepository employeeRepo;
    @Before
    public void setupMock() {
       MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testMockCreation(){
        assertNotNull(employee);
        assertNotNull(employeeRepo);
    }

}
