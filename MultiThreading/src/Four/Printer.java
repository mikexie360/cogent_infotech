package Four;


public class Printer extends Thread{
	Storage store;
	Printer(Storage store){
		this.store = store;
	}
	public void run() {
		int i = 0;
		while(true) {
			store.printer(i++);
		}
	}
}
