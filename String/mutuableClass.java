 // append insert replace delete reverse mutable class(stringBuffer & stringBuilder) 
package String;

public class mutuableClass {
//	method
	public static void my() {
		StringBuffer s = new StringBuffer("Hello");
		s.append("World");
		System.out.println("String is : "+s);
		s.insert(2, "preet");// (int off set ,string s)
		System.out.println("Insert is : "+s);
		s.replace(1, 3, "java");// ( beginwith, endswith ,string s)
		System.out.println("replace is : "+s);
		StringBuilder s1 = new StringBuilder("world");
		s1.replace(1, 3, "java");
		System.out.println("replace is : "+s1);
		s1.delete(1, 3);
		System.out.println("Delete is : "+s1);
		s1.reverse();
		System.out.println("Reverse is : "+s1);
	}
// main method
	public static void main(String[] args) {
		my();

	}

}
