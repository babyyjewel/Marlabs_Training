package com;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class out {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String c= "Hi, welcome";
		byte b[] = c.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("written");

}
}