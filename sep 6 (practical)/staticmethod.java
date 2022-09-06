// java program using static method.

package JavaProgram;

public class staticmethod {
	int rollno;
	String name;
	float fee;
//	static variable
	static String collage = "SRM";
//	static method
	static void change() {
		collage="GMS";
	}
//	constructor
	staticmethod(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name = name;
		this.fee = fee;
	}
//	display method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+collage);
	}

	public static void main(String[] args) {
//		calling static method
		staticmethod.change();
//		creating object
		staticmethod s = new staticmethod(4,"pritam",20000);
		staticmethod s1 = new staticmethod(3,"rohit",15000);
//		calling method display
		s.display();
		s1.display();

	}
}
