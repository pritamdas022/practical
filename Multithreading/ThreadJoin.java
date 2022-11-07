package Multithreading;
// class extends thread class
public class ThreadJoin extends Thread {
	// overriding method
	public void run() {
//		loop iteration
		for (int i = 0; i < 5; i++) {
//			try catch block
			try {
				Thread.sleep(800);
			} catch (Exception e) { // handling exception
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
//		main method
		ThreadJoin t = new ThreadJoin();
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
//		activate state thread
		t.start();
		try {
			t.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();

	}

}
