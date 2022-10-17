package ExceptionHandeling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NestedCatch {
// main method 
	public static void main(String[] args) {
//		scanner class
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number : " );
//		try block
		try {
			int x = s.nextInt();// user input of x
			int y = s.nextInt();// user input of y
			System.out.println(" "+x/y);// print
		} catch (InputMismatchException e) {// handling exception
			System.out.println(e);
		}
//		another catch block
		catch (Exception e) {// handling exception
			System.out.println(e);
		}

	}

}
