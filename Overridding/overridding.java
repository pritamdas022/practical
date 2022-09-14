// OVERRIDDING EXAMPLE 2
package JavaProgram;

class Exam{
	int marks() {
		return 0;
	}
}
class comp extends Exam{
	int marks() {
		return 80;
	}
}
class math extends Exam{
	int marks() {
		return 70;
	}
}
class science extends Exam{
	int marks() {
		return 50;
	}
} 
class eng extends Exam{
	int markks() {
		return 90;
	}
}
public class overridding {

	public static void main(String[] args) {
		comp c = new comp();
		math m = new math();
		science s = new science();
		eng e = new eng();
		System.out.println("computer marks is : "+c.marks());
		System.out.println("math marks is : "+m.marks());
		
		s.marks();
		e.marks();

	}

}
