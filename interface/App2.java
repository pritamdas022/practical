package Abstract;
// creating an interface
interface Interface1{
//	by default methods in interface
	void show();
	void display();
	void print();
}
// creating abstract class that implements one of  class
abstract class AbcClass implements Interface1{
	public void show() {
		System.out.println("inside show method");
	}
}
// creating a sub-class of the abstract class that inherit methods
class Class2 extends AbcClass{
	public void display() {
		System.out.println("inside display method");
	}
	public void print() {
		System.out.println("inside print method");
	}
}
public class App2 {

	public static void main(String[] args) {
		Interface1 obj = new Class2();
		obj.show();
		obj.display();
		obj.print();
	

	}

}
