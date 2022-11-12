package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyExample {

	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("E://test.txt");
			FileOutputStream f2 = new FileOutputStream("D://test1.txt");
			byte [] arr = new byte[1024];
			int i;
			while ((i = f1.read(arr))>0) {
				f2.write(arr);
			}
			f1.close();
			f2.close();
			System.out.println("done");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
