package Two;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
	
		stud.setNames();
		stud.setNames();
		stud.setNames();
		stud.setNames();

		stud.printNames();
		
		stud.getName("1");
		
		stud.printNamesKeySet();
		
		stud.printSize();
		
		stud.remove("1");
		stud.printNamesKeySet();

	}

}
