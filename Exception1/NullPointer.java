// invoked method on the null object


package ExceptionHandeling;


public class NullPointer {
		String s = null;
		int arr[]=null;
		String convert(String s) {
			return s.toUpperCase();
		}
	public static void main(String[] args) {
		NullPointer n = new NullPointer();
		System.out.println(n.convert(null));
		System.out.println(n.arr.length);
		System.out.println(n.toString().equals("pritam"));
		

	}

}
