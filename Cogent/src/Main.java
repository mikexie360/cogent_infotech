import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=null;
		
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		String des;
		double basic;

		
		while (true) {
			System.out.println("Enter employee id: ");
			id = sc.nextInt();
			System.out.println("Enter employee name: ");
			name = sc.next();
			System.out.println("Enter employee designation: ");
			des = sc.next();
			System.out.println("Enter the basic: ");
			basic = sc.nextFloat();
			try {
				emp = new Emp(id, name, des, basic);
			} catch (LowSalExpectation e) {
				System.out.println(e.toString());
			} finally {
				emp.printDET();
			}
		}
		
//		if (emp.designation.equals("Manager")) {
//			try {
//				emp = new Emp(1,"mike","Manager",1000);
//				emp.printDET();
//			} catch (LowSalExpectation e) {
//				System.out.println(e.toString());
//			}
//		} else if (emp.designation.equals("Officer")) {
//			try {
//				emp = new Emp(1,"mike","Officer",1000);
//				emp.printDET();
//			} catch (LowSalExpectation e) {
//				System.out.println(e.toString());
//			}
//		} else if (emp.designation.equals("Clerk")) {
//			try {
//				emp = new Emp(1,"mike","Clerk",100);
//				emp.printDET();
//			} catch (LowSalExpectation e) {
//				System.out.println(e.toString());
//			}
//		}
		
//		try {
//			emp = new Emp(1,"mike","Manager",1000);
//			emp.printDET();
//		} catch (LowSalExpectation e) {
//			System.out.println(e.toString());
//		}
//		try {
//			emp = new Emp(1,"mike","Officer",1000);
//			emp.printDET();
//		} catch (LowSalExpectation e) {
//			System.out.println(e.toString());
//		}
//		
//		try {
//			emp = new Emp(1,"mike","Clerk",100);
//			emp.printDET();
//		} catch (LowSalExpectation e) {
//			System.out.println(e.toString());
//		}
		//emp.printDET();
	}

}
