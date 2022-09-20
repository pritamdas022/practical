package Abstract;
// an abstract class which has abstract,non abstract and constructor.
abstract class Abstract{
	Abstract(){// constructor
		System.out.println("constructor created");
	}
	abstract void show();// abstract method
	void method1() { // non abstract method
		System.out.println("method 1 is created");
	}
}
class Anything extends Abstract{// child class
	void show() {
		System.out.println("method running successfully");
	}
}
public class AbstractNew {

	public static void main(String[] args) {
		Abstract abc = new Anything();
		abc.method1();
		abc.show();

	}

}
