package com;

class A
{
	public A()
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println("cons: "+i);
		}
	}
	public void abc()
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println("abc: "+i);
		}
	}
	public static void xyz()
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println("xyz: "+i);
		}
	}
}
interface I
{
	public void add(int a, int b);
}
class J
{
	public static void sum(int x, int y)
	{
		System.out.println("Sum : "+(x+y));
	}
}
class Sample
{
	Sample(String name)
	{
		System.out.println("Sample : "+name);	
	}
	Sample()
	{
		System.out.println("Default Sample");	
	}
}
interface Interf
{
	public Sample get(String name);
}
public class MethodReferenceDemo
{
	public static void main(String args[])
	{
		Thread t1 = new Thread(A::xyz);
		Thread t2 = new Thread(new A()::abc);
		Thread t3 = new Thread(A::new);
		t1.start();
		t2.start();
		t3.start();
		for(int i=1; i<=20; i++)
		{
			System.out.println("main : "+i);
		}

		I i1 = (a, b) -> System.out.println("Add : "+(a+b));

		i1.add(10, 20);
		i1 = J::sum;
		i1.add(30, 40);

		Interf i = Sample::new;
		Sample s1 = i.get("Pankaj");
		Sample s2 = i.get("Anadure");
		System.out.println(s1);	
		System.out.println(s2);
		System.out.println(i);		
	}
}