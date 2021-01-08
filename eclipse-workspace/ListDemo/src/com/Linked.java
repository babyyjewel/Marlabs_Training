package com;

import java.util.Iterator;
import java.util.Scanner;

public class Linked {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		String name;
		int age;
		String salary;
		String des;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int size= sc.nextInt();
		
		java.util.LinkedList<Object> list= new java.util.LinkedList<Object>();
		while(i<= size) {
			
			System.out.println("\nEnter Employee Name :");
			name = sc.next();
			System.out.println("Enter Employee Salary :");
			salary = sc.next();
			System.out.println("Enter Employee Age :");
			age = sc.nextInt();
			System.out.println("Enter Employee Designation :");
			 des = sc.next();
			list.add( name);
			list.add(salary);
			list.add( age);
			list.add( des);
			i=i+1;
		}
		System.out.println("Employee Details:");
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
