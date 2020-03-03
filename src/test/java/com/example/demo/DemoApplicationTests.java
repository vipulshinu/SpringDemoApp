//package com.example.demo;
//
//import com.example.demo.controller.ConsultaddController;
//
//import com.example.demo.model.Consultadd;
//import com.example.demo.service.ConsultaddService;
//import org.hamcrest.Matchers;
//import org.junit.Before;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcBuilder;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.ContentResultMatchers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import java.util.List;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//class DemoApplicationTests {
//
//
//	private MockMvc mockMvc;
//
//	@Autowired
//	private WebApplicationContext webApplicationContext;
//
//	@Before
//	public void setup() {
//		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//	}
//
//	@Test
//	public void testGetName() throws Exception {
//
//		 mockMvc.perform(get("/name/1")).andExpect(status().isOk());
////				.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
////				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("emp1")).andExpect(MockMvcResultMatchers.jsonPath("$.designation").value("manager"))
////				.andExpect(MockMvcResultMatchers.jsonPath("$.empId").value("1")).andExpect(MockMvcResultMatchers.jsonPath("$.salary").value(3000));
//
//
//	}
//
//}
