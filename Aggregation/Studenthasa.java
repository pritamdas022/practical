package JavaProgram;
// Another class within same package
public class Studenthasa {
//	declaring instance variable
	int id;
	String name;
	Addresshasa Address; // Aggregation
//	constructor
	public Studenthasa(int id,String name,Addresshasa Address) {
		this.id = id;
		this.name = name;
		this.Address = Address;
	}
//	method
	void show() {
		System.out.println(id+" "+name);
		System.out.println(Address.city+" "+Address.state+" "+Address.country+" "+Address.area);
	}
	public static void main(String ...args) {
//		Creating Addresshasa class object
		Addresshasa ad = new Addresshasa("kanthi","wb","india","ramnager");
//		creating Studenthasa class object and calling Studenthasa class
		Studenthasa sd = new Studenthasa(102,"pritam",ad);
//		sd object calling show method
		sd.show();
	}
	

}
