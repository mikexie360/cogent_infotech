package Four;


public class Counter extends Thread{
	Storage store;
	Counter(Storage store){
		this.store = store;
	}
	public void run() {
		while(true) {
			store.counter();
		}
	}
}
