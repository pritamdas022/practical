package ExceptionHandeling;

public class MultiCatch {
//	method
	public void myFun() {
//		try block
		try {
			int a = 50/0;// arithmetic exception
			System.out.println(a);
			int arr[] = new int[3];
			arr[4] = 50; // array index out of bound exception
		} catch (ArithmeticException e) {// handling occur
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {// handling occur
			System.out.println(e);
		}
//		finally block
		finally {
			System.out.println("its finally block");
		}
	}
//	main method
	public static void main(String[] args) {
//		creating object
		MultiCatch m1 = new MultiCatch();
//		calling method
		m1.myFun();
	}

}
