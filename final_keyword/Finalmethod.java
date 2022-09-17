// FINAL METHOD
package JavaProgram;
// class 1
class demo{
//	final method
final void method(){
		System.out.println(" nothing");
	}
}
// class 2
class exp extends demo{
	void method1() { // we can not override  final method
		System.out.println("somthing");
	}
}

public class  Finalmethod  {
	public static void main(String[] args) {
		exp f = new exp();
		f.method();
		f.method();
	}
}

		