package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
//		taking input of array size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
//		taking input array elements
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the index "+(i+1)+ " element : ");
			arr[i]= sc.nextInt();
		}
//		method
		Arrays.sort(arr);
		System.out.println("Second smallest number is : "+arr[1]);

	}

}
