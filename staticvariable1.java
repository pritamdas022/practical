package JavaProgram;
// class 1
 class staticvariable1 {
	int rollno;
	String name;
	float fee;
//	static variable
	static String collage = "SRM";
//	constructor
	staticvariable1(int rollno,String name,float fee){
//		using this keyword
		this.rollno=rollno;
		this.name = name;
		this.fee = fee;
	}
//	method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+collage);
	}

	public static void main(String[] args) {
//		creating objects
		staticvariable1 s = new staticvariable1(2,"pritam",20000);
		staticvariable1 s1 = new staticvariable1(3,"rohit",15000);
		
		s.display();
		s1.display();

	}

}
