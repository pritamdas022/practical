package String;

import java.util.Scanner;
// check equality by using equal() method

public class stringEquality {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st string :");
		String s1 = sc.next();
		System.out.println("Enter the 2nd string : ");
		String s2= sc.next();
		
//		comparing two input string
		if (s1.equals(s2)) {
			
			System.out.println("Equal string : ");
		}else {
			System.out.println("Not equal string");
		}

	}

}
