
public class Emp {
	int empId;
	String empName;
	String designation;
	double basic;
	double hra;
	
	public Emp(int id, String name, String designation, double basic) throws LowSalExpectation {
		System.out.println("I am in the constructor");
		empId= id;
		empName = name;
		this.designation = designation;
		this.basic = basic;
		if (this.basic < 500) {
			throw new LowSalExpectation("Salary is too low.");
		}
		
		System.out.println("I am leaving the constructor");
	}
	
	public void printDET() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Designation: " + designation);
		System.out.println("Basic: " + basic);
		System.out.println("HRA: " + hra);
		System.out.println();
	}
	public void calculateHRA() {
		if (designation.equals("Manager")) {
			this.hra = .1* basic;
		}
		else if (designation.equals("Officer")) {
			this.hra = .12* basic;
		} else if (designation.equals("Clerk")) {
			this.hra = .05* basic;
		} else {
			this.hra = 0;
		}
		

	}
}
