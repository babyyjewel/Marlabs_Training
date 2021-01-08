package com;

import java.util.HashMap;
import java.util.Map;


public class Hashmapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(505, "Jeena");
		m.put(902, "Neena");
		m.put(603, "Teena");
		m.put(304, "Meena");
		
		for(Map.Entry ms:m.entrySet())
		{
			System.out.println(ms.getKey()+ "  " + ms.getValue());
		}
		
	}

}
