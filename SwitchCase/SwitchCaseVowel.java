package JavaProgram;

public class SwitchCaseVowel {

	public static void main(String[] args) {
		char ch = 'e';
		String vowel = "";
		switch(ch) {
		case'a': vowel ="a is vowel";
		break;
		case'e': vowel ="e is vowel";
		break;
		case'i': vowel ="i is vowel";
		break;
		case'o': vowel ="o is vowel";
		break;
		case'u': vowel ="u is vowel";
		break;
		case'A': vowel ="A is not vowel";
		break;
		case'E': vowel ="E is not vowel";
		break;
		default:
			System.out.println("wrong choice");
		}
		System.out.println(vowel);
}
}
