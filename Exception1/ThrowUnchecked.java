
// example of throw unchecked exception ------- run time


package ExceptionHandeling;

public class ThrowUnchecked {
	public static void eligible(int age) {// to check whether person is eligible
		if (age<18) {
//			throw arithmetic exception if person age is <18
			throw new ArithmeticException("you are not eligible for vote");
		}
		else {
			System.out.println("person eligible for vote");
		}
	}

	public static void main(String[] args) {
		eligible(13);
		System.out.println("done");
	

	}

}
