// java program using static variable.

package JavaProgram;
 class StaticVar{   // class 1
	int rollno;
	String name;
	float fee;
//	static variable
	static String collage = "SRM";
//	constructor
	StaticVar(int rollno,String name,float fee){
//		using this keyword
		this.rollno=rollno;
		this.name = name;
		this.fee = fee;
}
//	method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+collage);
	}

public class Staticvariable {  // class 2

	public static void main(String[] args) {
//		creating objects
		StaticVar s = new StaticVar(1,"pritam",20000);
		StaticVar s1 = new StaticVar(3,"rohit",15000);
//		calling display method
		s.display();
		s1.display();


	}

}
}
