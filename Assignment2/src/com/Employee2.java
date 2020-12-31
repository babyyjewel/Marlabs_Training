package com;

import java.util.*;


public class Employee2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name;
		int Age;
		int Salary;
		String Designation;
		int Increment;
		int NewSalary;
		
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name : ");
        Name = sc.next();
        System.out.println("Enter the employee age : ");
		Age = sc.nextInt();
		System.out.println("Enter the employee salary : ");
		Salary = sc.nextInt();
		System.out.println("Enter the employee designation : ");
		Designation = sc.next();
		System.out.println("Name :" + Name);
		System.out.println("Name :" + Age);
		System.out.println("Name :" + Salary);
		System.out.println("Name :" + Designation);
		 System.out.println("Increment: ");
		 Increment = sc.nextInt();
		 NewSalary = Salary + Increment;
		 System.out.println("New Salary: " +NewSalary);
		 
		 
		
		
	}

}
