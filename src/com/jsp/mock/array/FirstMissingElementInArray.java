package com.jsp.mock.array;

public class FirstMissingElementInArray {
	public static void main(String[] args) {
		int[] a = { -1, 0, 1, 4, 5, 6 };
		int missing = findMissing(a);
		System.out.println(missing);
	}

	public static int findMissing(int[] a) {
		int missing = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] + 1 != a[i + 1]) {
				return a[i] + 1;

			}
		}
		return -1;

	}
}
