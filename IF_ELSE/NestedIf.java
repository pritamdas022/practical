// USE NESTED IF ELSE
package JavaProgram;
import java.util.*;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num%2!=0) {
			System.out.println("not ok");
			if(num>100) {
				System.out.println("ok");
			}
		}else {
			if(num>5&&num<10) {
				System.out.println("not ok");
			}else if(num>11&&num<100) {
				System.out.println("ok");
			}else if(num>100) {
				System.out.println("num>100");
			}
		}
		

	}

}
