// SINGLE INHERITANCE

package JavaProgram;

class vehicle{ // class A
	void running() { // class A method
		System.out.println("running mode on");
	}
}
class car extends vehicle{ // class B inherit class A
	void run() { // class B method
		System.out.println("car is running");
	}
}
public class singlein {

	public static void main(String[] args) {
		car car1 = new car(); // creating class B object
//		calling methods
		car1.running(); 
		car1.run();

	}

}
