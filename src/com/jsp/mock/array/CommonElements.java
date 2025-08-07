package com.jsp.mock.array;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
	public static void main(String[] args) {
		int[] a = { 2, 5, 3, 7, 6 };
		int[] b = { 3, 6, 5, 2, 0 };

		ArrayList<Integer> result = new ArrayList();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					result.add(a[i]);
				}
			}
		}
		int res[] = new int[result.size()];

		for (int i = 0; i < result.size(); i++) {
			res[i] = result.get(i);
		}
		System.out.println(Arrays.toString(res));

	}
}
