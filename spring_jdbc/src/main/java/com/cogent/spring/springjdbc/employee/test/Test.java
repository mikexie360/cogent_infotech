package com.cogent.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cogent.spring.springjdbc.employee.dto.Employee;

import com.cogent.spring.springjdbc.employee.dao.*;
import com.cogent.spring.springjdbc.employee.dao.impl.EmployeeDAOImp;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cogent/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO dao=(EmployeeDAOImp)ctx.getBean("employeeDao");
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setFirstName("Mike");
		emp.setLastName("Xie");
		int i = dao.create(emp);
		//int result = dao.update(employee);
		//int result = dao.delete(1);
		//int read = dao.read(employee);
		// Employee employee = dao.read(2);
		// List<Employee> result = dao.read();
		if(i>0) {
			System.out.println("Object saved");
		}
	
	
	}
}
