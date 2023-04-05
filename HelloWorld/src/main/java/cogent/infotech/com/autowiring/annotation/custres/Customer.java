package cogent.infotech.com.autowiring.annotation.custres;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String name;
	@Autowired
	private Reservation res;
	
	@Autowired
	public Customer(Reservation res) {
		this.res = res;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getRes() {
		return res;
	}
	@Autowired
	public void setRes(Reservation res) {
		this.res = res;
	}
	
	
}
