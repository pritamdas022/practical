package Array;
// to get the class name of array in java
public class classNameArray {

	public static void main(String[] args) {
//		declaration & initialization of an array
		int arr[]= {1,2,3};
		Class c = arr.getClass();// getting the class name
		String name = c.getName();// print the class name
		System.out.println(c);

	}

}
