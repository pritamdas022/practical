package String;

public class IgnoreCase {

	public static void main(String[] args) {
		String str1= "This is Program";
		String str2= "This is program";
		System.out.println("String 1 "+str1);
		System.out.println("String 2 "+str2);
//		compare the two strings.
		int result = str1.compareToIgnoreCase(str2);
//		Display the results of the comparison.
		
		if (result<0) {
			System.out.println("\""+ str1+"\""+"\""+" is less than "+"\""+str2+"\"");
		}else if (result==0) {
			System.out.println("\""+str1+"\""+"\""+"\""+"is equal to"+"\""+str2+"\"");
		}else if (result>0)  {
			System.out.println("\""+str1+"\""+"\""+"\""+"is greater than"+"\""+str2+"\"");
		}

	}

}
