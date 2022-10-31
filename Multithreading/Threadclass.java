package Multithreading;
// extend the thread class
public class Threadclass extends Thread {
//	thread method
	public void run() {
		System.out.println("thread activated");
	}
// main method
	public static void main(String[] args) {
//		creating object
		Threadclass t1 = new Threadclass();
//		the start method moves the thread to the active state
		t1.start();

	}

}
