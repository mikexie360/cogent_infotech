package polymorphism;

public class Ointment extends Medicine{

	public Ointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ointment(String drug, String companyName, String companyAddress) {
		super(drug, companyName, companyAddress);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("For External use only");
	}
}
