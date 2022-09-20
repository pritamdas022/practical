package JavaProgram;

abstract class Abstraction { // parent class
	abstract void method(); // abstract method
}
class Test1 extends Abstraction{ // child class
	void method() { // non abstract method
		System.out.println("method running sucessfully");
	}
}
class newtest extends Abstraction{ // child class 
	void method() { // non abstract method
		System.out.println("new test method running sucessfully");
	}
}
// main class
public class Abstract{
	public static void main(String[] args) {
//		creating  parent class reference variable and creating newtest child class object
		Abstraction ab = new newtest();
//		calling child class method
		ab.method();

	}

}
