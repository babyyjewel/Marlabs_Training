package comm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class MainAppp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
			Student s1= new Student(289,"jeena",9999);
			Student s2= new Student(389,"neena",9999);
			Student s3= new Student(489,"meena",9999);
			Student s4= new Student(589,"teena",9999);
		   System.out.println(s1);
		   System.out.println(s2);
		   System.out.println(s3);
		   System.out.println(s4);
		   
		   
		   try {
			   FileOutputStream fos = new FileOutputStream("hello.txt");
			   ObjectOutputStream ous = new ObjectOutputStream(fos);
			   ous.writeObject(s1);
			   ous.writeObject(s2);
			   ous.writeObject(s3);
			   ous.writeObject(s4);
			   ous.flush();
			   ous.close();
			   System.out.println("written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hello.txt"));
			 Student s = (Student)ois.readObject();
			
			System.out.println("marks: " +s.marks);
			System.out.println("name: " +s.name);
			System.out.println("mobileno: " +s.mobileno);
			ois.close();
	}

}
