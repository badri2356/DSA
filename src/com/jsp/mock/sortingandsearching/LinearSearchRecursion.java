package com.jsp.mock.sortingandsearching;

public class LinearSearchRecursion {
	public static void main(String[] args) {
		int[] a = { 2, 5, 2, 1, 3, 7, 5, 8 };
		System.out.println(search(a, 4, 0));
	}

	public static int search(int[] a, int key, int i) {
		if (i >= a.length)
			return -1;
		if (a[i] == key)
			return i;

		return search(a, key, i + 1);
	}
}
