package IO;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Byte_Array_OP {

	public static void main(String[] args) {
		try {
			FileOutputStream f1 = new FileOutputStream("D:\\test.txt");
			FileOutputStream f2 = new FileOutputStream("E:\\test.txt");
			ByteArrayOutputStream bob = new ByteArrayOutputStream();
			bob.write(65);
			bob.writeTo(f1);
			bob.writeTo(f2);
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
