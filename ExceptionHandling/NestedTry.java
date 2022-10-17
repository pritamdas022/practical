package ExceptionHandeling;

public class NestedTry {
// main method
	public static void main(String[] args) {
		try { // outer block
			try { // inner block
				System.out.println("goimg to divide by 0");
				int n = 19/0;
			} catch (ArithmeticException e) { // catch block of inner try block 1
				System.out.println(e);
			}try { // inner try block 2
				int a[]=new int[5];
				a[6]=4; // assigning the value out of array bounds
			} catch (ArrayIndexOutOfBoundsException e) { // catch block of inner try block 2
				System.out.println(e);
			}
			System.out.println("other statement");
		} 
		catch (Exception e) { // catch block of outer block
			System.out.println("handled the exception (outer catch)");
		}
		System.out.println("normal flow");

	}

}
