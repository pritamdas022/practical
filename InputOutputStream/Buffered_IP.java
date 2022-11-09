package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class Buffered_IP {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D:\\text.txt");
			BufferedInputStream bob = new BufferedInputStream(f);
			int i;
			while ((i= bob.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
