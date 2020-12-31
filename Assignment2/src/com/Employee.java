package com;

public class Employee {
	
	String Name;
	int Age;
	int Salary;
	String Designation;
	int Increment;
	int NewSalary;
	
	public Employee() {

		Name="Jewel";
		Age= 22;
		Salary=30000;
		Designation="Developer";
	}
		void display()
		{
			System.out.println("Employee Name : "+ Name);
			System.out.println("Employee Age : "+ Age);
			System.out.println("Employee Current Salary : "+ Salary);
			System.out.println("Employee Designation : "+ Designation);
		}
		
		void raisedsalary(){
			
			Increment = 20000;
			NewSalary= Increment + Salary;
			System.out.println("Increment : " +  Increment);
			System.out.println("New Salary : " +  NewSalary);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.display();
		e1.raisedsalary();
		
	}

}
