package com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> set= new TreeSet<Object>();
		set.add("5");
		set.add("9");
		set.add("7");
		set.add("3");
		set.add("5");
		set.add("6");
		set.add("1");
		set.add("8");
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
