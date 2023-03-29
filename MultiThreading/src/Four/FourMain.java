package Four;


public class FourMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage st = new Storage();
		new Printer (st).start();;
		new Counter (st).start();;		
		
	}

}
