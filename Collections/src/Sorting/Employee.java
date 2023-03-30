package Sorting;
import java.util.*;
public class Employee implements Comparable<Employee> {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Employee o) {
		int id1 = this.id;
		int id2 = o.id;
		
		if (id1<id2) {
			return -1;
		} else if (id1>id2) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	public String toString() {
		return name;
	}
}
