package com;

import java.util.Scanner;

public class Employeee {
	
	String Name;
	int Age;
	long Salary;
	String Designation;
	int Increment;
	int NewSalary;
	
	public Employeee() {

		Name="Jewel";
		Age= 22;
		Salary=30000;
		Designation="Developer";
		
	}
		void display()
		{

			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the employee name : ");
	        Name = sc.next();
	        System.out.println("Enter the employee age : ");
			Age = sc.nextInt();
			System.out.println("Enter the employee salary : ");
			Salary = sc.nextInt();
			System.out.println("Enter the employee designation : ");
			Designation = sc.next();
			System.out.println("\nName :" + Name);
			System.out.println("Age :" + Age);
			System.out.println("Current Salary :" + Salary);
			System.out.println("Designation:" + Designation);
			
			 System.out.println("\nSalary Increment: ");
			 Increment = sc.nextInt();
			 
			 NewSalary =(int) Salary + Increment;
			 System.out.println("\nName :" + Name);
				System.out.println("Age :" + Age);
			 System.out.println("New Salary: " +NewSalary);
			 System.out.println("Designation :" + Designation);
			 sc.close();
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employeee e1 = new Employeee();
		e1.display();
		
	}

}
