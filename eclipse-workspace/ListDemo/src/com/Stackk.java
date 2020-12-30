package com;

import java.util.Iterator;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Stack<Object> list= new java.util.Stack<Object>();
		list.add("Minu");
		list.add("Ninu");
		list.add("Tinu");
		list.add("Linu");
		list.add("Minu");
		list.add("Ninu");
		list.add("Tinu");
		list.add("Linu");
		
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
