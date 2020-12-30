package com;

import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashSet<Object> set= new java.util.HashSet<Object>();
		set.add(6);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
