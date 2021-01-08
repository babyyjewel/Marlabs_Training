package com;

import java.util.Iterator;

public class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedList<Object> list= new java.util.LinkedList<Object>();
		
		list.add("Ramu");
		list.add("Somu");
		list.add("Remu");
		list.add("Timu");
		list.add("Ramu");
		list.add("Somu");
		list.add("Remu");
		list.add("Timu");
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
