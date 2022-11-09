package IO;

import java.io.FileOutputStream;

public class writeBytes {

	public static void main(String[] args) {
		try {
			FileOutputStream f= new FileOutputStream ("D:\\test.txt");
			String s ="welcome to Anudip Foundation";
			f.write(67);
			f.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
