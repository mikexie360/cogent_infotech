package esg.itp.shape;

public class Rectangle implements Polygon {

	float area;
	float perimeter;
	
	float length;
	float breadth;
	
	public Rectangle(float len, float bre) {
		this.length = len;
		this.breadth = bre;
	}
	
	public void calcArea() {
		// TODO Auto-generated method stub
		this.area = (this.breadth *this.length);
	}

	public void calcPeri() {
		// TODO Auto-generated method stub
		this.perimeter = (this.length *2) + (this.breadth*2);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
		System.out.println("Area is: " + this.area);
		System.out.println("Perimeter is: "+ this.perimeter);
	}

}
