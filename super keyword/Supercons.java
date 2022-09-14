// USING SUPER KEYWORD AND ACCESS CONSTRUCTOR TO THE PARENT CLASS
package JavaProgram;
// parent class
class shape2{
	public shape2() { // parent class constructor
		System.out.println("hello");
	}
}
// child class
class size2 extends shape2{
	size2(){ // child class constructor
		super(); // using super keyword
		System.out.println("hi");
	}
}
// main class
public class Supercons {
	public static void main(String []args) {
		 size2 s = new size2();
	}

}
