package com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> set= new TreeSet<Object>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("1");
		set.add("2");
		set.add("4");
		set.add("3");
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
