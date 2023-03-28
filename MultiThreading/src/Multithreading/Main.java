package Multithreading;

class MyThread extends Thread{
	
	MyThread(){
		super("Demo Thread");
		System.out.println("The Child Thread: " + this);
		start();
	}
	
	@Override
	public void run() {
		for (int i =5; i>0;i--) {
			System.out.println("i: "+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting the child thread");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();
		
		
		for (int j = 0; j <= 10;j++) {
			System.out.println("j: "+j+"\t");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting the Main thread");
	}
}
