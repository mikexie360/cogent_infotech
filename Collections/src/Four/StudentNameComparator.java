package Four;

import java.util.*;
public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student one, Student two) {
		return one.getName().compareTo(two.getName());
	}
}
