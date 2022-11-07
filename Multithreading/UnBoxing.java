package Multithreading;

import java.util.ArrayList;
// main class
public class UnBoxing {

	public static void main(String[] args) {
//		main method
		ArrayList<Integer>a1 = new ArrayList<Integer>();
		Integer a = new Integer(2);
		Integer i = a.intValue();// converting Integer into int
		Integer j = a; // now compiler will write int.value()unboxing
		System.out.println(a+" "+i+" "+j);

	}

}
