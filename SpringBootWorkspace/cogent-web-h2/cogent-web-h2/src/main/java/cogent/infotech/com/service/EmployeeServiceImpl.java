package cogent.infotech.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Employee;
import cogent.infotech.com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		return (Employee)employeeRepository.save(emp);
	}

	@Override
	public List<Employee> fetchEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>)employeeRepository.findAll();
	}

}
