package JavaProgram;

public class Overloadingtypepromotion { // class
	void add(int a,int b) { // method of argument int type
		System.out.println("This is integer type sum "+(a+b));
	}
	void add(long a,long b) { // method of argument long type
		System.out.println("This is long type sum "+(a+b));
	}

	public static void main(String[] args) { // main class
		Overloadingtypepromotion obj = new Overloadingtypepromotion();
		obj.add(5, 12);
		obj.add(4l,13l);

	}

}
