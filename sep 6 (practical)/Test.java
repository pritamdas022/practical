// java program using this keyword.

package JavaProgram;
// class 1
class Thiskeyword{
//	declaring variable
	int id_no;
	String name;
	float fee;
//	constructor
	Thiskeyword(int idno,String name,float fee){
//		using this keyword
		this.id_no = idno;
		this.name = name;
		this.fee = fee;
	}
// method
void display() {
	System.out.println(id_no+" "+name+" "+fee);	
}
}
// class 2
public class Test {

	public static void main(String[] args) {
//		creating objects
		Thiskeyword t1 = new Thiskeyword(101,"pritam",5000);
		Thiskeyword t2 = new Thiskeyword(110,"rohit",6000);
//		calling display method
		t1.display();
		t2.display();

	}

}
