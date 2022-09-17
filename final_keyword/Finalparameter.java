// final parameter
package JavaProgram;
//parent class
class ABCD{
//	 method 1
	void method(final int a) {
		a=a+1; // we can not change final parameter
		System.out.println(a);
	}
}
// child class
class abcd extends ABCD{
//	 method 2
	void method1(int a ,double b) {
		System.out.println(a+b);
	}
}
// main class
public class Finalparameter {

	public static void main(String[] args) {
//		creating object of child class
		abcd a = new abcd();
//		calling parent class method
		a.method(5);
		a.method1(10, 5);

	}

}
