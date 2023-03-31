import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> arr = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		do {
			System.out.println("----------Menu---------");
			System.out.println("0-Exit");
			System.out.println("1-Create Employee");
			System.out.println("2-Update Employee");
			System.out.println("3-Delete Employee");
			System.out.println("4-Read All");
			System.out.println("5-Search Employee");
			System.out.println("6-Sort");

			switch(sc.nextInt()) {
			case 0:
				System.exit(0);
				break;
			case 1:
				dao.create(arr);
				break;
			case 2:
				dao.update(arr);
				break;
			case 3:
				dao.delete(arr);
				break;
			case 4:
				dao.readAll(arr);
				break;
			case 5:
				dao.searchEmployee(arr);
				break;
			case 6:
				dao.empSort(arr);
				break;
			}
			
			
			
			
		} while(true);
	}

}
