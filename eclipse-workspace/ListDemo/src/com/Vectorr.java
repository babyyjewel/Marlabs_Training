package com;

import java.util.Iterator;

public class Vectorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Vector<Object> list= new java.util.Vector<Object>();
		list.add("Hi");
		list.add("Hello");
		list.add("Welcome");
		list.add("Helloooo");
		list.add("Hi");
		list.add("Hello");
		list.add("Welcome");
		list.add("Helloooo");
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
