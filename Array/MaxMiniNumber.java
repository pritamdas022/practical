//5. Write a Java program to find the maximum and minimum value of an array. 
package Array;
import java.util.*;
public class MaxMiniNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int arr[] = new int[n];
		System.out.println("Enter the the elements an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
			if (arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
						
		}
		System.out.println("Maximam value is : "+max);
		System.out.println("minimum value is : "+min);
			
		}
		}


