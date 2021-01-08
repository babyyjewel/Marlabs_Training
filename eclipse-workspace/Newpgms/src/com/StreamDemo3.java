package com;
import java.util.*;
import java.util.stream.*;

public class StreamDemo3
{
	public static void main(String args[])
	{
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6, 7);
		List<Integer> l3 = Arrays.asList(8, 9, 10);

		List<List<Integer>> list = Arrays.asList(l1, l2, l3);
		//System.out.println(list);
		//list.forEach(System.out::println);
		
		List<Integer> result = list.stream().flatMap(lst -> lst.stream()).collect(Collectors.toList());
		//List<Integer> result = list.stream().flatMap(lst -> lst.stream()).map(x->x+x).collect(Collectors.toList());
		System.out.println(result);
	}
}