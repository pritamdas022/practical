package Abstract;
// achieve multiple inheritance by interface 
interface InterfaceDemo1{// 1st interface
	void show();
}
interface InterfaceDemo2{// 2nd interface
		void show();
}
class multiIn implements InterfaceDemo1,InterfaceDemo2{// child class
	public void show() {
		System.out.println("hi");
	}
		void print() {
		System.out.println("hello");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		multiIn m = new multiIn();
		m.show();
		m.print();
		

	}

}
