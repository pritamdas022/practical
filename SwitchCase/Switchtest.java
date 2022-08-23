//SWITCH CASE EXAMPLE 1
package JavaProgram;

public class Switchtest {

	public static void main(String[] args) {
//		declaring variable
		int day = 7;
		String daystring = "";
//		switch expression
		switch(day) {
//		case statement
		case 1:daystring = "1-sunday";
		break;
		case 2:daystring = "2-monday";
		break;
		case 3:daystring = "3-tueday";
		break;
		case 4:daystring = "4-wedday";
		break;
		case 5:daystring = "5-thursday";
		break;
		case 6:daystring = "6-friday";
		break;
		case 7:daystring = "7-saturday";
		break;
//		default statement
		default:System.out.println("your number is invalid");
		}
//		printing output the case day
		System.out.println(daystring);

	}

}
