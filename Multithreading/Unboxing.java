package Multithreading;

import java.util.ArrayList;

public class Unboxing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// autoboxing
		list.add(6);
		list.add(3);
		System.out.println("Arraylist : "+list);
		// unboxing
		int a = list.get(0); // 6 Integer convert to int
		System.out.println("Value of index 0:"+a);

	}

}
