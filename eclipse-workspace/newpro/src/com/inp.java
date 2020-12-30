package com;

import java.io.FileNotFoundException;
import java.io.IOException;

public class inp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		try {
			java.io.FileInputStream fis = new java.io.FileInputStream("abc.txt");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		

	}

}
