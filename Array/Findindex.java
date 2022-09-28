// 1. WRITE A JAVA PROGRAM TO FIND THE INDEX OF AN ARRAY ELEMENT.
package Array;

import java.util.Scanner;

public class Findindex {
//	method
	public static int findindex(int arr[],int n) {
		if (arr==null) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==n) {
				return i;
			}
		}
		return 0;
	}
//	main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any elements number {25,35,76,84,26,30,50} in array list : ");
		int t = sc.nextInt();
		int[]arr= {25,35,76,84,26,30,50};
		System.out.println("Index position of "+t+" number is : "+findindex(arr, t));


	}

}
