// 4. Write a Java program to insert an element (specific position)into an array. 
package Array;
import java.util.*;

public class InsertElement {

	public static void main(String[] args) {
		int arr[] = {25,60,74,38,83,45};
		
		System.out.println("original array is "+Arrays.toString(arr));
		
		int removeIndex= 1;
		for(int i = removeIndex; i <arr.length -1; i++){
	        arr[i] = arr[i + 1];
	      }
		System.out.println("after delet elements is : "+Arrays.toString(arr));
	 }
	}


