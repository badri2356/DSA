package com.jsp.mock.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("Rakesh", 20);
		map.put("Badri", 23);
		map.put("Barsa", 24);
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
