// java program copy constructor.

package JavaProgram;

public class copyconst {
	int age ;
	String name;
//	constructor
	copyconst(int a,String n){
		age = a;
		name = n;
		
	}

	copyconst(){}
//	output method
	void show() {
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
//		creating objects
		copyconst c1 = new copyconst(20,"pritam");
		copyconst c2 = new copyconst();
		c2.age = c1.age;
		c2.name = c1.name;
//		calling show method
		c1.show();
		c1.show();
		

	}

}

