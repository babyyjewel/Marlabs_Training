package com;


import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(104, "Jeena");
		m.put(902, "Neena");
		m.put(405, "Teena");
		m.put(108, "Meena");
		
		for(Map.Entry ms:m.entrySet())
		{
			System.out.println(ms.getKey()+ "  " + ms.getValue());
		}
	}

}
