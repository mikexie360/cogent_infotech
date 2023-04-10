package cogent.infotech.com.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Employee;
import cogent.infotech.com.service.EmployeeService;
import jakarta.annotation.Generated;

@RestController
@Lazy
public class EmployeeController {
	@Autowired
	@Lazy
	private EmployeeService employeeService;

	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@PostMapping(value="/employees")
	public Employee saveEmployee(@Validated @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList(){
		return employeeService.fetchEmployee();
	}

}
