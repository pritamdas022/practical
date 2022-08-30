package JavaProgram;

class Studentclass1{
//	declaring fields
	int id;
	String name;
}
// creating another class
public class Studentclass {
//	declaring fields
	int age;
	String name;



	public static void main(String[] args) {
//		creating objects
		Studentclass st = new Studentclass();
//		this object is another class object
		Studentclass1 sr = new Studentclass1();
//		initializing objects 
		sr.id = 101;
		sr.name = "arnab";
		st.age = 15;
		st.name = "pritam";
//		printing
		System.out.println(st.age+" "+st.name);
		System.out.println(sr.id+" "+sr.name);

	}

}
