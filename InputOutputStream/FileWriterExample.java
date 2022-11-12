package IO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter f1 = new FileWriter("E://test.txt");
			f1.write("Welcome to Anudip foundation skill development center");
			FileReader fr = new FileReader("E://test.txt");
			int i = 0;
			while ((i = fr.read())!=-1) {
				System.out.println((char)i);
			}
			f1.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
