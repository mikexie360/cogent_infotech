package esg.itp.shape;

public class Square implements Polygon {
	float area;
	float perimeter;
	float side;
	
	public Square(float s) {
		this.side = s;
	}
	
	public void calcArea() {
		// TODO Auto-generated method stub
		this.area = this.side * this.side;
	}

	public void calcPeri() {
		// TODO Auto-generated method stub
		this.perimeter = this.side *4;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Square");
		System.out.println("Area is: " + this.area);
		System.out.println("Perimeter is: "+ this.perimeter);
	}

}
