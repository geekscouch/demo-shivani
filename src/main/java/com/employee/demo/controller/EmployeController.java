package com.employee.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.Employe;
import com.employee.demo.request.EmployeRequest;
import com.employee.demo.service.EmployeService;

@RestController
@RequestMapping("employe")
public class EmployeController {

	
	@Autowired
	private EmployeService employeService;
	
	
	@GetMapping("/{empId}")
	public Employe getEmployeDetail(@PathVariable (name = "empId") Integer empId) {
		return employeService.getEmployeDetail(empId);
		
	}
	
	@PostMapping
	public Employe createEmployeDetail(@RequestBody EmployeRequest employeRequest) {
		return employeService.createEmployeDetail(employeRequest);
		
	}
}
