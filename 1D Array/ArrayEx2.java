package Array;

// Return an array from the method
public class ArrayEx2 {

//		creating method which return the array 
		static int[] printarray() {
//			anonymous array
			return new int[]{20,30,50,70};
		}
					public static void main(String[] args) {
//						calling method
				int arr[]=printarray();
//     traversing the array
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}

	}

}
