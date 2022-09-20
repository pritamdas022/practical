package Abstract;
// default method in interface(since java 8)
interface Abc{
	void print();// abstract 1
	default void show() {// default 1
		System.out.println("hi");
	}
}
class abc implements Abc{
public void print() {
		System.out.println("in print method");
	}
}
public class App {

	public static void main(String[] args) {
		Abc a = new abc();
		a.show();
		a.print();

	}

}
