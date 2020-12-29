package com.employee.demo.service;

import com.employee.demo.entity.Employe;
import com.employee.demo.request.EmployeRequest;

public interface EmployeService {

	Employe getEmployeDetail(Integer EmpId);

	Employe createEmployeDetail(EmployeRequest employeRequest);

}
