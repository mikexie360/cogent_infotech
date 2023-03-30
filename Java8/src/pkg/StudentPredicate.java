package pkg;

import java.util.function.Predicate;

import java.util.ArrayList;

public class StudentPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student(1,"a","a"));
		stud.add(new Student(2,"b","b"));

		Predicate<Student> p1 = (in) ->{
			return in.getRollNo() == 2;
		};
		
		for (Student stu: stud) {
			if (p1.test(stu)) {
				System.out.println("Student number: "+stu.getRollNo() +
						"\nStudent class name: "+ stu.getClassName() +
						"\nStudent name: " + stu.getName());
			}
		}
		
		
	}

}
