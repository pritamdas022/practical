// MULTILEVEL INHERITENCE

package JavaProgram;

class animal{ // class A
	void voice() { // class A method
		System.out.println("animals can not speak");
	}
}
class dog extends animal{ // class B inherit class A
	void bark() { // class B method
		System.out.println("dogs called barking");
	}
}
class cat extends dog{ // class C inherit class B
	void meow() { // class C method
		System.out.println("cats called meow");
	}
}
public class multilevelin {

	public static void main(String[] args) {
//		creating class C object
		cat c = new cat();
//		calling methods
		c.voice();
		c.bark();
		c.meow();
		

	}

}
