package com.dbs.empMgmt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dbs.empMgmt.model.Employee;

@Repository("h2dao")
public class H2employeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public H2employeeDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Employee save(Employee employee) {
        this.jdbcTemplate.execute("insert into employee (id) values ('"+employee.getId()+" )");
        return employee;
    }

    @Override
    public Employee update(long empId, Employee employee) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public void deleteEmployee(long id) {

    }
}