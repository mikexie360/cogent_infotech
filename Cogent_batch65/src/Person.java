
public class Person {
	int personID;
	String personFirstName;
	String personlastName;
	int personAge;
	String personAddress;

	// default constructor
	public Person() {
		this.personID = 0;
		this.personFirstName = "";
		this.personlastName="";
		this.personAge=0;
		this.personAddress="";
	}
	// parameterised constructor
	public Person(int personID, String personFirstName, String personlastName,
			int personAge, String personAddress) {
		super();
		this.personID = personID;
		this.personFirstName = personFirstName;
		this.personlastName = personlastName;
		this.personAge = personAge;
		this.personAddress = personAddress;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getPersonFirstName() {
		return personFirstName;
	}

	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}

	public String getPersonlastName() {
		return personlastName;
	}

	public void setPersonlastName(String personlastName) {
		this.personlastName = personlastName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
}
