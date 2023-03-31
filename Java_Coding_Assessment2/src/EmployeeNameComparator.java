
import java.util.*;

public class EmployeeNameComparator implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		String s1 = e1.employeeName;
		String s2 = e2.employeeName;
		return s1.compareTo(s2);
	}
}
