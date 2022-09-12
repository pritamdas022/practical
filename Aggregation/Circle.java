package JavaProgram;

// first class
class operation{
//	method
	int squere(int a) {
	return a*a;
}
}
// second class
public class Circle {
//	aggregation
	operation op;
	double pi = 3.14;
//	method
	double area(int redius) {
//		creating operation class object
		op = new operation();
//		declaring rsquere new variable and calling squere method with help of op object 
		int rsquere = op.squere(redius);
		return pi*rsquere;
	}

	public static void main(String[] args) {
//		creating circle class object
		Circle c = new Circle();
//		declaring result variable and calling area method with help of c object 
		double result = c.area(5);
//		printing result
		System.out.println(result);

	}

}
