// USING SUPER KEYWORD AND ACCESSS INSTANCE VARIABLE TO THE PARENT CLASS 
package JavaProgram;
// parent class
class shape{
	String name = "circle"; // data member of parent class
}
// child class
class size extends shape{
	String name = "Triangle"; // child class data member
	void displayname() { // method
		System.out.println(name); // display the of the size class
		System.out.println(super.name); // display the name of the parent(shape) class
	}
}
// main class
public class SuperIV {
	public static void main(String[] args) {
//		creating size class object
		size s = new size();
		s.displayname(); // calling the displayname method 

	}

}
