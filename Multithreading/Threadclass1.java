package Multithreading;
// main class
public class Threadclass1 {
// main method
	public static void main(String[] args) {
//		creating object of the thread class using thread constructor
		Thread obj = new Thread("pritam");
		obj.start();// active state of thread
//		getting the thread name by invoking the getName()method
		String str = obj.getName();
		System.out.println(str);

	}

}
