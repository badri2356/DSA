package com.jsp.mock.array;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 8, 9 };
		int[] b = { 1, 5, 3, 7, 2, 8 };

		Set<Integer> union = new HashSet<Integer>();
		for (int num : a) {
			union.add(num);
		}
		for (int num : b) {
			union.add(num);
		}

		System.out.println(union);
	}
}
