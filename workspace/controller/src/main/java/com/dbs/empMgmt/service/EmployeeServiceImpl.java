package com.dbs.empMgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dbs.empMgmt.dao.EmployeeDAO;
import com.dbs.empMgmt.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("h2dao") EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public Employee saveEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}

	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	public Employee findById(long empid) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(empid);
	}

	public void deleteEmployee(long empid) {
		// TODO Auto-generated method stub
		this.employeeDAO.deleteEmployee(empid);
	}

}
