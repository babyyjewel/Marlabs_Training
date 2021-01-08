package com;


import java.util.LinkedHashMap;
import java.util.Map;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(356, "Jeena");
		m.put(879, "Neena");
		m.put(234, "Teena");
		m.put(104, "Meena");
		
		for(Map.Entry ms:m.entrySet())
		{
			System.out.println(ms.getKey()+ "  " + ms.getValue());
		}
	}

}
