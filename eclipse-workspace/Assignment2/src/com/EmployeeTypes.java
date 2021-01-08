package com;

class Clerk{
	int CNewSalary;
	int CSalary=20000;
	public void display() 
	{
		
		System.out.println("Current Clerk Salary :" + CSalary);
			
	}
	public void raisedsalary() 
	{
		CNewSalary  = CSalary+2000;
	System.out.println("\nNew Clerk Salary :" + CNewSalary);
	}
}

class Programmer{
	int PNewSalary;
	int PSalary=30000;
	public void display() 
	{
		
		System.out.println("Current Programmer Salary :" + PSalary);
			
	}
	public void raisedsalary() 
	{
		PNewSalary  = PSalary+5000;
	System.out.println("New Programmer Salary :" + PNewSalary);
	}
}

class Manager{
	int MNewSalary;
	int MSalary=40000;
	public void display() 
	{
		
		System.out.println("Current Manager Salary :" + MSalary);
			
	}
	public void raisedsalary() 
	{
		MNewSalary  = MSalary+10000;
	System.out.println("New Manager Salary :" + MNewSalary);
	}
}




 class EmployeeTypes {
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CNewSalary;
		//System.out.println("Current Clerk Salary :" );
		//System.out.println("Current Programmer Salary :" + PSalary);
		//System.out.println("Current Manager Salary :" + MSalary);
		Clerk c1 = new Clerk();
		c1.display();
		
		
		Programmer p1 = new Programmer();
		p1.display();
		
		
		Manager m1 = new Manager();
		m1.display();
		
		c1.raisedsalary();
		p1.raisedsalary();
		m1.raisedsalary();
	}

}
	
