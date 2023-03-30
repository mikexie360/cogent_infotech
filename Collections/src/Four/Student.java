package Four;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	
	public Student() {
		rollNo = 0;
		name = "";
	}
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		String name1 = this.name;
		String name2 = o.name;
		
		return name1.compareTo(name2);
	}
	
	@Override
	public String toString(){
		return "RollNo: " + rollNo + " Name: " + name +" ";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
