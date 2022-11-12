package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Student implements Serializable {
	int id;
	String name;
	transient int fees;
	public Student(int id,String name,int fees) {
	this .id = id;
	this.name = name;
	this.fees = fees;

}
 }