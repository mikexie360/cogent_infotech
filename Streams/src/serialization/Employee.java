package serialization;
import java.io.Serializable;
public class Employee implements Serializable{
	int id;
	String name;
	int salary;
	int ssn;
	public Employee() {
		super();
	}
	public Employee(int id, String name, int salary, int ssn) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
}
