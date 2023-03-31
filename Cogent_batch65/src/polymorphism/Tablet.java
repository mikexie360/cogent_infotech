package polymorphism;

public class Tablet extends Medicine{

	public Tablet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tablet(String drug, String companyName, String companyAddress) {
		super(drug, companyName, companyAddress);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Store in a cool dry place");
	}
}
