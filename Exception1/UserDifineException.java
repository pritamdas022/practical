// under the throwable class
package ExceptionHandeling;

class UserDifineException1 extends Exception{ // parent exception
	public UserDifineException1(String str) {
		super(str); // call the constructor
	}
}
public class UserDifineException {
	public static void main(String[] args) {
		try {
			throw new UserDifineException1("user define exception");
		} catch (UserDifineException1 e) {
			System.out.println("Exception occur");
			System.out.println(e.getMessage());
		}

	}

}
