package com;

import java.util.*;
import java.util.stream.*;

public class StreamDemo
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();

		list.add(22);
		list.add(44);
		//list.add(null);
		list.add(24);
		list.add(33);
		list.add(21);
		list.add(99);
		//list.add(null);
		list.add(55);
		list.add(66);

		System.out.println(list);

		List l1 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l1);

		List l2 = list.stream().map(x->x+x).collect(Collectors.toList());
		System.out.println(l2);

		//List l3 = list.stream().takeWhile(x->x%2==0).collect(Collectors.toList());
		//System.out.println(l3);

		//List l4 = list.stream().dropWhile(x->x%2==0).collect(Collectors.toList());
		//System.out.println(l4);

		//Stream.iterate(1, x->x<100, x->x+1).forEach(System.out::println);

		//List l5 = list.stream().flatMap(e->Stream.ofNullable(e)).collect(Collectors.toList());
		//System.out.println(l5);
	}
}