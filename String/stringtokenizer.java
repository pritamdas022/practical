package String;

import java.util.StringTokenizer;

public class stringtokenizer { // class
	public static void my() {
		StringTokenizer t = new StringTokenizer("Anudip foundation skill and carrer development center");
		while(t.hasMoreElements()) {
			
//			 boolean method it checks if there is more tokens available or not
			
			System.out.println(t.nextToken(" "));// string method it returns the next token from string tokenizer obj
			StringTokenizer st = new StringTokenizer("I am pritam , staying in digha");
			while (st.hasMoreElements()) {
				System.out.println(st.nextToken(","));
				
			}
		}
	}

	public static void main(String[] args) {
		my();

	}

}
