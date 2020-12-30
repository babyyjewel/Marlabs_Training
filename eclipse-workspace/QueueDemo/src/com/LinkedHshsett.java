package com;

import java.util.Iterator;

public class LinkedHshsett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedHashSet<Object> set= new java.util.LinkedHashSet<Object>();
		set.add(9);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(9);
		set.add(4);
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
