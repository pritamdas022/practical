package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {

	public static void main(String[] args) {
		try {
			Student s = new Student(101, "Pritam", 2000);
			FileOutputStream  fout = new FileOutputStream("E://test.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(s);
			obj.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
