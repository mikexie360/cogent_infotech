package cogent.infotech.com.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Employee;

@Service
public interface EmployeeService {
	Employee saveEmployee(Employee emp);
	List<Employee> fetchEmployee();
}
