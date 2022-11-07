package Multithreading;
// main class
public class sequentialEx {
//	override method
		public void run() {
//			loop iteration
			for (int i = 1; i <=5; i++) {
//				try catch block
				try {
					Thread.sleep(200);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println(i);
				
			}
		}
// main method
	public static void main(String[] args) {
// creating class objects
		sequentialEx t1 = new sequentialEx();
		sequentialEx t2 = new sequentialEx();
		sequentialEx t3 = new sequentialEx();
//		activate state of thread
		t1.run();
		t2.run();
		t3.run();

	}

}
