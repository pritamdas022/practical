package ExceptionHandeling;

public class TryCatch {

	public static void main(String[] args) {
//		try block
		try {
			int num = 25/0; // may exception occur
			System.out.println("tahole r print hobe na");
//			catch block
		} catch (Exception e) { // handling exception
			System.out.println(e);
		}

	}

}
