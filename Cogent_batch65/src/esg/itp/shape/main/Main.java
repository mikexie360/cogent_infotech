package esg.itp.shape.main;

import esg.itp.shape.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(5.0f);
		
		Rectangle r = new Rectangle(5.0f,4.0f);
		s.calcArea();
		s.calcPeri();
		r.calcArea();
		r.calcPeri();
		s.display();
		r.display();
	}

}
