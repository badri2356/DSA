package com.jsp.mock.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] a = new int[] { 2, 8, 5 ,7};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(a, target)));
		;
	}

	public static int[] twoSum(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < a.length; i++) {
			int compliment = target - a[i];

			if (map.containsKey(compliment)) {
				return new int[] { map.get(compliment), i };
			}

			map.put(a[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
