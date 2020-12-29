 package com.employee.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.employee.demo.controller.EmployeController;
import com.employee.demo.entity.Employe;
import com.employee.demo.service.EmployeService;

@RunWith(SpringRunner.class)
@WebMvcTest(value= EmployeController.class)
@WithMockUser
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	@Autowired
	private EmployeService employeService;	
	
	Employe emplObject = new Employe(1,"asd","qwe","ert",2000);
	
	@Test
	public void retrieveEmployeDetail() throws Exception{
		Mockito.when(employeService.getEmployeDetail(Mockito.anyInt())).thenReturn(emplObject);
		RequestBuilder rs = MockMvcRequestBuilders.get("/employe/empId").accept(MediaType.APPLICATION_JSON);
		
		MvcResult res = mockmvc.perform(rs).andReturn();
	
		System.out.println(res.getResponse());
		
		String expected = "{id: 1, name : asd, managerName : qwe, dept : ert , salary : 2000}";
		
		JSONAssert.assertEquals(expected, res.getResponse().getContentAsString(), false);
	}

}
