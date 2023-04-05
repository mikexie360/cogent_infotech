package cogent.infotech.innerbean;

public class Person {
	private Car car;
	Address add;
	
	public Person(Car car, Address add) {
		super();
		this.car = car;
		this.add = add;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
