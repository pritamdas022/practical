package IO;

import java.io.FileInputStream;

public class writeBytesIN {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\test1.txt");
			int i =0;
			while ((i=f.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
