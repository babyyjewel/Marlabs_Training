package com;

import java.time.LocalDate;
import java.time.LocalTime;

interface A{
	 void  display();
	//default void print() {
	//	System.out.println("Default method");
	
	//}
	
	//static void show() {
	//	System.out.println("Show method");
	//
	//}
	
	
	
}


public class InterfaceDemo{
	
	//public void display() {
//		System.out.println("Implemented method");
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfaceDemo id = new InterfaceDemo();
		//id.display();
		//id.print();
		//A.show();
		A a1 =()->{ 
			System.out.println("Default method");
		};
		a1.display();
		LocalDate ld = LocalDate.now();
		System.out.println("Todays Date : "+ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println("Todays Time : "+lt);
		
		LocalDate ls = LocalDate.of(2021, 05, 03);
		System.out.println("Todays Date : "+ls.getDayOfMonth());
		
}
}
