package com.employee.demo.request;

import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeRequest {
	
	private String name;
	private String managerName;
	private String dept;
	private Integer salary;

}
