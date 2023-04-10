package cogent.infotech.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	
	private String name="Mike";
	private float salary=100f;
	
	@GetMapping("/employee/{name}")
	public String display() {
		return "Employee name is "+ name + " and salary is " + salary;
	}
	
}
