package Seven;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		
		stud.setName("Bike");
		stud.setName("Dike");
		stud.setName("Hike");
		stud.setName("Like");
		stud.setName("Mike");
		stud.printNames();

		stud.searchName("Mike");
		stud.searchName("Zike");
		
		stud.searchName(0);
		stud.searchName(-1);
		
		stud.printNames();
		
		stud.removeName("Mike");
		stud.printNames();
	}

}
