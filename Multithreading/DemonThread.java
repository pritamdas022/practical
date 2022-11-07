package Multithreading;

// class extends the thread class
public class DemonThread extends Thread {
	public void run() {
//		override method
		System.out.println("Name :"+Thread.currentThread().getName());
		System.out.println("Demon :"+Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
//		main method
		DemonThread d1 = new DemonThread();
		DemonThread d2 = new DemonThread();
		//activate state OfDouble thread
		d1.start();
		d1.setDaemon(true);// setting demon
		d2.start();

	}

}
