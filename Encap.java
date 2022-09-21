package Encapsulation;

class encap1{
	private String name; // private data member
	public String getName(){ // getter method
		return name;
	}
	public void setName(String name) {// setter method
		this.name=name;
		System.out.println("name updated successfully ");
	}
}
public class Encap {

	public static void main(String[] args) {
		encap1 e = new encap1();
		e.setName("pritam"); // setting the string
		System.out.println(e.getName());// getter method calling

	}

}
