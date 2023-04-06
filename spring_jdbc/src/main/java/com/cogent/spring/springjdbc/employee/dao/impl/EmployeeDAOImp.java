package com.cogent.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.cogent.spring.springjdbc.employee.dao.EmployeeDAO;
import com.cogent.spring.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDAOImp implements EmployeeDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub
		String sql="insert into employee values(?,?,?)";
		int result=jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> read() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
