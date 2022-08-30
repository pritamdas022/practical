package JavaProgram;

public class objectmethod {
//	declaring fields
	int age;
	String name;
//	input method
	public void input(int a,String n) {
		age = a;
		name = n;
		
	}
//	output method
	void display() {
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
//		creating objects
		objectmethod obj = new objectmethod();
		objectmethod obr = new objectmethod();
//		initializing objects
		obj.input(15,"pritam");
		obr.input(20, "arnab");
//		printing
		obj.display();
		obr.display();
	}

}
