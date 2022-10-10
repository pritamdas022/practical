package String;

import java.util.Scanner;

public class stringTest {
	public void show() {// method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");// line no 1
		String A = sc.next();// 1st string
		String B = sc.next();// 2nd string
		
		System.out.println(A.length()+B.length());// 1st string length+(concat)2nd string length
		System.out.println((A.compareTo(B))>0?"yes":"no");// compare to 
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(2)+""+B.substring(0,1).toUpperCase()+B.substring(1));
	}

	public static void main(String[] args) {
		stringTest t = new stringTest();
		t.show();

	}

}
