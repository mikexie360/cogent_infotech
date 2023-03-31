package Compartment;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] comp = new Compartment[10];
		
		Random rand = new Random();
		int r = 0;
		for (int i = 0; i < comp.length; i++) {
			r = rand.nextInt(3) +1;
			if (r == 1) {
				comp[i] = new FirstClass();
			}
			if (r == 2) {
				comp[i] = new General();
			}
			if (r == 3) {
				comp[i] = new Ladies();
			}
			if (r == 4) {
				comp[i] = new Luggage();
			}
			
		}
		for( int i = 0; i < comp.length; i++) {
			
			
			comp[i].notice();
		}
	}

}
