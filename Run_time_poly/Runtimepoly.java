// RUN TIME POLYMORPHISOM EX:1
package JavaProgram;
// parent class
class runtime{
//	 method
	void show() {
		System.out.println("show anything");
	}
}
// child class
class poly extends runtime{
//	 method
	void show() {
		System.out.println("show nothing");
	}
}
// main class
public class Runtimepoly {

	public static void main(String[] args) {
//		creating object of parent class
		runtime r = new runtime();
//		calling the parent method
		r.show();

	}

}
