// HIREECHICAL INHERITANCE

package JavaProgram;

class vehical{ // class A
	void running() { // class A method
		System.out.println("running mode on");
	}
}
class car extends vehical{ // class B inherit class A
	void run() { //class B method
		System.out.println("car is running");
	}
}
class bike extends vehical{ // class C inherit class A
	void speed() { // class C method
		System.out.println("bike have very high speed");
	}
}
public class Hirerchicalin {

	public static void main(String[] args) {
//		creating objects class B and class C
    bike b = new bike();
    car c = new car();
//    calling methods
    b.running();
    c.run();
    b.speed();

	}

}
