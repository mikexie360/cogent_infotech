package polymorphism;

public class Medicine {
	String drug;
	String companyName;
	String companyAddress;
	
	
	
	public Medicine() {
		super();
	}
	public Medicine(String drug, String companyName, String companyAddress) {
		super();
		this.drug = drug;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}
	public String getDrug() {
		return drug;
	}
	public void setDrug(String drug) {
		this.drug = drug;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	public void displayLabel()
	{
		System.out.println("Drug Name: "+ drug);
		System.out.println("Company Name: "+ companyName);
		System.out.println("Company Address: "+ companyAddress);

	}
}
