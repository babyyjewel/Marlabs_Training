package com;

import java.util.Iterator;

public class Arraylistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		java.util.ArrayList<Object> list= new java.util.ArrayList<Object>();
		list.add("Jeena");
		list.add("Neena");
		list.add("Reena");
		list.add("Teena");
		list.add("Jeena");
		list.add("Neena");
		list.add("Reena");
		list.add("Teena");
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
