package com;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Object> deque= new ArrayDeque<Object>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		
		Iterator<Object> itr = deque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
