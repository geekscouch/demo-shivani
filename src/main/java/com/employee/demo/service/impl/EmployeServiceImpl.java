package com.employee.demo.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.dao.EmployeDao;
import com.employee.demo.entity.Employe;
import com.employee.demo.request.EmployeRequest;
import com.employee.demo.service.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	private EmployeDao employeDao;

	@Override
	public Employe getEmployeDetail(Integer empId) {
		if (Objects.isNull(empId))
			throw new IllegalArgumentException("Employee Id is not be null");

		return employeDao.findEmployeByEmpId(empId);
	}

	@Override
	public Employe createEmployeDetail(EmployeRequest employeRequest) {
		if(Objects.isNull(employeRequest))
			throw new IllegalArgumentException("Requested Object not be null, please provide full information");
		
		Employe employe = new Employe();
		
		employe.setName(employeRequest.getName());
		employe.setManagerName(employeRequest.getManagerName());
		employe.setDept(employeRequest.getDept());
		employe.setSalary(employeRequest.getSalary());
		
		employeDao.save(employe);
		
		return employeDao.save(employe);
	}

}
