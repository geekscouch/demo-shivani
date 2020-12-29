package com.employee.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employe")
@ToString
public class Employe implements Serializable{

	
	public Employe(int empId, String name, String managerName, String dept, int salary) {
		this.empId =  empId;
		this.name =  name;
		this.managerName =  managerName;
		this.dept = dept;
		this.salary = salary;
	}
	private static final long serialVersionUID = -8350649908722800943L;

	@Id
	@Column(name = "employeId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	@Column(name = "employe_name")
	private String name;
	@Column(name = "manager_name")
	private String managerName;
	@Column(name = "employe_dept")
	private String dept;
	@Column(name = "employe_salary")
	private Integer salary;
}
