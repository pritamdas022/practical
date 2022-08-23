//PRINT THIS PATTERN
/*
  1
  12
  123
  1234
  12345
  1234567
  12345678
  123456789
  
 */
package JavaProgram;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j;
		
		for(i = 1;i<10;i++) {
			for(j = 1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
