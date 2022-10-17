package ExceptionHandeling;


public class TryCatchExample {
//	method
	public void show() {
		String a = "i am error";// string variable
		System.out.println(a);// print 
//		try block
		try {
			int num = 50/0;// arithmetic exception
			System.out.println(num);
			String r = "riya";
			System.out.println(r.length());
			int arr[] = new int[3]; 
			arr[4]=24; // ArrayIndexOutOfBoundException
			int m = Integer.parseInt(r);// number format exception
			System.out.println(m);
//			catch block
		} catch (Exception e) { // handling occur
			System.out.println(e);
		}
		String b = "i can not be handle"; // variable
		System.out.println(a+" "+b);

	}
//	main method
	public static void main(String[] args) {
//		creating object
		TryCatchExample t1 = new TryCatchExample();
//		calling method
		t1.show();

}
}
