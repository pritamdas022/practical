package String;
//  represent any object to string
public class ToString {
	int rollno;// integer type variable
	String name,adder;// string type variables
//	ToString constructor
	ToString(int rollno,String name,String adder) {
		this.rollno= rollno;
		this.name = name;
		this.adder = adder;
	}
	public String toString(){// return object to string
	return super.toString();// object to string
	}
	public static void main(String[] args) {
		ToString s1 = new ToString(1, "ram", "mumbai");// return the hashcode value
		ToString s2 = new ToString(2, "karan", "Delhi");
		
		System.out.println(s1);// compiler write s1.toString
		System.out.println(s2);

	}

}
