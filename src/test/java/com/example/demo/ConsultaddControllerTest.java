package com.example.demo;


import com.example.demo.model.*;
import com.example.demo.service.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import org.springframework.boot.test.context.SpringBootTest;



import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class ConsultaddControllerTest {

    @Mock
    ConsultaddService consultaddServiceMock;

//    @MockBean
//    ConsultaddRepository consultaddRepositoryMock;

    @Test
    public void getNameTest() throws Exception
    {
        when(consultaddServiceMock.getName()).thenReturn(Stream.of(new Consultadd(1L,"divyanshu","cse",78500,"no"),
                        new Consultadd(2L,"sandeep","it",65582,"yes")).collect(Collectors.toList()));
        Assert.assertEquals(2,consultaddServiceMock.getName().size());

    }

    @Test
    public void getByIdTest() throws Exception
    {
        when(consultaddServiceMock.getById(1)).thenReturn(new Consultadd(1L,"divyanshu","it",652454,"yes"));
        int a = Integer.parseInt(consultaddServiceMock.getById(1).getEmpId().toString());
        Assert.assertEquals(1,a);
    }

   @Test
    public void updateTest() throws Exception
   {
       Consultadd consultadd = new Consultadd(1L,"divyanshu updated","cse",85565,"no");
       consultaddServiceMock.updateConsultant(1,consultadd);
       verify(consultaddServiceMock,times(1)).updateConsultant(1,consultadd);

   }

   @Test
    public void deleteTest() throws Exception
   {
       consultaddServiceMock.delete(1L);
       verify(consultaddServiceMock,times(1)).delete(1L);
   }

   @Test
    public void addUserTest() throws Exception
   {
       Consultadd consultadd = new Consultadd(2L,"ritik","mech",965255,"yes");
       consultaddServiceMock.addName(consultadd);
      // System.out.println(consultaddServiceMock.getById(2L).getEmpId());
   }

    }


//    @Autowired
//     WebApplicationContext webApplicationContext;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup(){
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
//
//    @Test
//    public void getNametest() throws Exception {
//        MvcResult mvcResult = mockMvc.perform(get("/name")).andReturn();
//        MockHttpServletResponse res = mvcResult.getResponse();
//        int r = res.getStatus();
//        Assert.assertEquals(200,r);
//    }
//
//    @Test
//    public void getNameByIdTest() throws Exception {
//        MvcResult mvcResult =  mockMvc.perform(get("/name/2")).andReturn();
//         int r = mvcResult.getResponse().getStatus();
//         Assert.assertEquals(200,r);
//    }
//
//    @Test
//    public void deleteTest () throws Exception {
//
//        MvcResult mvcResult = mockMvc.perform(delete("/delete/2")).andReturn();
//        int i = mvcResult.getResponse().getStatus();
//        Assert.assertEquals(200,i);
//    }
//
//    @Test
//    public void addNameTest() throws Exception
//    {
//        String exampleJson = "{\"name\":\"Spring\",\"dept\":\"CS\",\"salary\":25000,\"pf\":\"no\"}";
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .post("/name")
//                .accept(MediaType.APPLICATION_JSON).content(exampleJson)
//                .contentType(MediaType.APPLICATION_JSON);
//
//        int result = mockMvc.perform(requestBuilder).andReturn().getResponse().getStatus();
//        System.out.println(result);
//        Assert.assertEquals(200,result);
//    }
//
//    @Test
//    public void updateTest() throws Exception
//    {
//        String exapmlejson = "{ \"name\" :\"updated\",\"dept\":\"IT\",\"salary\":45211,\"pf\":\"yes\"}";
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .put("/update/4")
//                .accept(MediaType.APPLICATION_JSON).content(exapmlejson)
//                .contentType(MediaType.APPLICATION_JSON);
//        int re = mockMvc.perform(requestBuilder).andReturn().getResponse().getStatus();
//        Assert.assertEquals(200,re);
//    }


