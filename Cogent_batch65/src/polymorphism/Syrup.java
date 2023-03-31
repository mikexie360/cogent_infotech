package polymorphism;

public class Syrup extends Medicine{

	public Syrup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Syrup(String drug, String companyName, String companyAddress) {
		super(drug, companyName, companyAddress);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Ingest by drinking");
	}
}
