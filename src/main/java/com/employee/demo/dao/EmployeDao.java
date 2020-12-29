package com.employee.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.Employe;

@Repository
public interface EmployeDao extends JpaRepository<Employe ,Integer>{

	Employe findEmployeByEmpId(Integer empId);

}
