//8. Write a Java program to find the number of even and odd integers in a given array of integers.
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = ex.nextInt();
	
		int a[]= new int[n];
		System.out.println("Enter the elements in an array :");
		for (int i = 0; i < a.length; i++) {
			a[i]=ex.nextInt();
		}
		System.out.println("Original array "+Arrays.toString(a));
		
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  

	}

}

