
public class Rectangle {
	int length;
	int breadth;
	public Rectangle() {
		length = 0;
		breadth = 0;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int calculateArea() {
		return length * breadth;
	}
	
	public void display() {
		System.out.println("Length: "+length +
				"\nBreadth: " + breadth +
				"\nArea: " + calculateArea());
	}
}
