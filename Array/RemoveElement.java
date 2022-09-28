//2. Write a Java program to remove a specific element from an array. 
package Array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] my_array= {14,40,5,30,9,34};
		System.out.println("original elements is : "+Arrays.toString(my_array));

	int removeindex=0;
	for(int i = removeindex;i<my_array.length-1;i++) {
		my_array[i]=my_array[i+1];
}
	System.out.println("After remove element numbers is : "+Arrays.toString(my_array));
}
}