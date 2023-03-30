package Four;

import java.util.*;

public class StudentSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student(2,"C"));
		stud.add(new Student(3,"B"));
		stud.add(new Student(4,"F"));
		stud.add(new Student(5,"D"));
		stud.add(new Student(1,"A"));

		System.out.println(stud);
	
		stud.sort(new StudentNameComparator());
		
		System.out.println(stud);
	}

}
