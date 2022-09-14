// OVERRIDDING

package JavaProgram;
// creating parent class
 class Overridding1 {
	void run() {
		System.out.println("running mode on");
	}
}
// creating child class
class testoverridding extends Overridding1{
//	defining same name method as its declared in parent class
	void run() {
		System.out.println("running mode off");
	}
}
public class Overridding{

	public static void main(String[] args) {
//		creating a object of child class
		testoverridding t = new testoverridding();
		t.run();

	}

}
