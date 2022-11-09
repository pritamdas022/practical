package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Buffered_IO {

	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:\\test.txt");
			BufferedOutputStream bob = new BufferedOutputStream(f);
			String s = "Anudip ";
			byte b[] = s.getBytes();
			f.write(b);
			f.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
