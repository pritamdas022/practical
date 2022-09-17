// FINAL CLASS
package JavaProgram;
// parent class final
 final class democlass{
//	method
	void run() {
		System.out.println("running mode on");
	}
}
// child class
class testclass extends democlass{ // we can not inherit final class
//	method
	void run() {
		System.out.println("running mode off");
	}
}
// main class
public class Finalclass {

	public static void main(String[] args) {
//		creating child class object
		testclass t1 = new testclass();
		t1.run();

	}

}
