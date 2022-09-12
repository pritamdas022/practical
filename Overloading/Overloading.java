// METHOD OVERLOADING : CHANGING DATA TYPE OF ARGUMENT
package JavaProgram;

class Addition{ // class
	static int add(int a,int b) { // no. of arguments 2 add is a method
		return a+b;
	}
	static double add(double a,double b,double c) { // no.of arguments 3 add is a method
		return a+b+c;
	}
}
public class Overloading { // main class

	public static void main(String[] args) {
		
		System.out.println(Addition.add(5,4));
		System.out.println(Addition.add(13.5, 24.6,14.6));

	}

}
