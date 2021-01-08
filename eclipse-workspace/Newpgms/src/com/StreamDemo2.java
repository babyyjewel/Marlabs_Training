package com;

import java.util.*;
import java.util.stream.*;

public class StreamDemo2
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();

		list.add(22);
		list.add(44);
		list.add(24);
		list.add(33);
		list.add(21);
		list.add(99);
		list.add(55);
		list.add(66);
		System.out.println(list);

		List l1 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l1);

		List l2 = list.stream().map(x->x+x).collect(Collectors.toList());
		System.out.println(l2);

		System.out.println("-------------------------------------");

		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);		

		System.out.println("-------------------------------------");

		random.ints().limit(10).sorted().forEach(System.out::println);		

		System.out.println("-------------------------------------");

		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		streamIterated.forEach(System.out::println);

		System.out.println("-------------------------------------");

		IntStream intStream = IntStream.range(1, 11);
		intStream.forEach(System.out::println);
		LongStream longStream = LongStream.rangeClosed(1, 11);
		longStream.forEach(System.out::println);

		System.out.println("-------------------------------------");

		List<Integer> l3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		l3.stream().limit(5).skip(2).forEach(System.out::println);

		System.out.println("-------------------------------------");

		OptionalInt reduced = IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println(reduced.getAsInt());

		int reduced2Params = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println(reduced2Params);

		int reducedParams1 = Stream.of(1, 2, 3).reduce(10, (a, b) -> a + b, (a,b) -> a + b);
		System.out.println(reducedParams1);

		int reducedParams2 = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a,b) -> a + b);
		System.out.println(reducedParams2);
	
		IntSummaryStatistics stats = IntStream.range(1, 10).summaryStatistics();

		System.out.println(stats);
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());	
	}
}