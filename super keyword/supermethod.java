// USING SUPER KEYWORD AND ACCESS METHOD TO THE PARENT CLASS
package JavaProgram;
// parent class
class shape1{
	void print() { // parent class method
		System.out.println("print circle");
	}
}
// child class
class size1 extends shape1{
	void print() { // child class method
		System.out.println("print noyhing"); // display  of the size class
	}
	void display() {
		System.out.println("print nothing");
	}
		void show() { // final method
		super.print();
		display();
	}
}
// main class
public class supermethod {
	public static void main(String[] args) {
		size1 s = new size1();
		s.show();

	}

}


