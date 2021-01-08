package com;

import java.util.*;
import java.util.stream.*;
class Emp
{	private String name;
	private int age;
	public Emp(String name, int age)
	{	this.name = name;
		this.age = age;
	}
	public int getAge()
	{	return age;
	}
	public String toString()
	{	System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		return "";
	}
}
public class SummaryStatisticsDemo
{	public static void main(String args[])
	{	List<Emp> list = new ArrayList<Emp>();
		
		list.add(new Emp("Raju", 32));
		list.add(new Emp("Manju", 22));
		list.add(new Emp("Suraj", 31));
		list.add(new Emp("Pramod", 26));
		list.add(new Emp("Dinesh", 53));
		list.add(new Emp("Manoj", 42));
		list.add(new Emp("Chetan", 22));

		IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(p->p.getAge()));

		System.out.println(stats);
		System.out.println("Senior : " + stats.getMax());
		System.out.println("Junior : " + stats.getMin());
		System.out.println("Sum of all ages : " + stats.getSum());
		System.out.println("Average of all ages : " + stats.getAverage());	
	}
}