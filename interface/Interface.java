package JavaProgram;
interface Demotest{// interface declaration
	void display() ;
}
class Demo1 implements Demotest{ // 1st implementation
	public void display() {
		System.out.println("Display");
	}
}
class Demo2 implements Demotest{// 2nd implementation
	public void display() {
		System.out.println("Display 1");
	}
}
public class Interface {

	public static void main(String[] args) {
		Demotest d = new Demo2();
		d.display();

	}

}
