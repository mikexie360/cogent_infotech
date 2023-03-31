
public class Car {
	int speed;
	int noOfGear;
	public Car(int speed, int noOfGear) {
		super();
		this.speed = speed;
		this.noOfGear = noOfGear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getNoOfGear() {
		return noOfGear;
	}
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	
	public void drive() {
		speed =0;
		noOfGear = 1;
	}
	public void display() {
		System.out.println("Speed " + speed);
		System.out.println("noOfGear "+ noOfGear);
	}
	
}
