package IO;

import java.io.ByteArrayInputStream;

public class ByteArrayIP {

	public static void main(String[] args) {
		byte[]Arr = {77,66,67,69,64};
		ByteArrayInputStream f = new ByteArrayInputStream(Arr);
		int i = 0;
		while ((i=f.read())!=-1) {
			char c = ((char)i);
			System.out.println("ASCII character : "+i+" value is : "+c);
		}

	}

}
