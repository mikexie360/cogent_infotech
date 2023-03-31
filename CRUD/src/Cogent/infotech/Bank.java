package Cogent.infotech;

public abstract class Bank {
	// an abstract class
	
	float rateOfInterest;
	abstract float getRateOfInterest();
	
	
}

class SBIBank extends Bank{
	float rateOfInterest=7.25f;
	@Override
	public float getRateOfInterest() {
		return rateOfInterest;
	}
}

class HDFCBank extends Bank {
	float rateOfInterest = 7.00f;
	
	@Override
	public float getRateOfInterest() {
		return rateOfInterest;
	}
}