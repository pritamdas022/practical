// 7. Write a Java program to find the duplicate values of an array
package Array;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
//		taking input array elements
		int[] array = new int[n];
		System.out.println("Enter the elements of an array : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
//		 calculating duplicate elements
        for (int i = 0; i <array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element is : "+array[j]);
                }
            }
        }

	}

}
