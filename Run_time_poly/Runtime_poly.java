// RUN TIME POLYMORPHISOM EX:2
package JavaProgram;
// parent class
class zoo{
	int a = 10;
//	 method 
	void bark() {
	System.out.println("barking");
	}
}
// child class extend parent class
class cat1 extends zoo{
	int a = 20;
//	method
	void bark() {
		System.out.println("meow");
	}
}
// child class extend parent class
class dog1 extends zoo{
//	 method
	void bark() {
		System.out.println("baff");
	}
}
// main class
public class Runtime_poly {

	public static void main(String[] args) {
//		refference variable of parent class with the object 
		zoo z;
		z= new cat1();
		z.bark();
		z= new dog1();
		z.bark();

	}

}
