// DYNAMIC PROGRAM
package JavaProgram;
//parent class
class Dyna{
//	method
	void display() {
		System.out.println("hmmmmm...........");
	}
}
// child class
class mic extends Dyna{
//	 method
	void display() {
		System.out.println("I can do it");
	}
}
// main class
public class Dynamicprogram {
	public static void main(String[] args) {
	mic d = new mic();
		d.display();

	}

}
