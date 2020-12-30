package com;

import java.util.Iterator;

public class Queuee {

	public static void main(String[] args) {
	
		java.util.PriorityQueue<Object> queue= new java.util.PriorityQueue<Object>();
		queue.add(9);
		queue.add(1);
		queue.add(8);
		queue.add(6);
		queue.add(7);
		queue.add(2);
		queue.add(9);
		queue.add(1);
		 
		
		
		Iterator<Object> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	}


