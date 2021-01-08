package com;
import java.util.*;
import java.util.stream.*;

public class MapStreamDemo
{
	public static void main(String args[])
	{
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(11, "Rajesh");
		map.put(22, "Suresh");
		map.put(33, "Ganesh");
		map.put(44, "Dinesh");
		map.put(55, "Thanesh");

		//Set<Map.Entry<Integer, String>> s = map.entrySet();
		//s.forEach(System.out::println);

		map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
		map.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);
		System.out.println("----------------");
		map.entrySet().stream().filter(me-> me.getKey()>30).map(Map.Entry::getValue).forEach(System.out::println);
	}
}