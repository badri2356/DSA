package com.jsp.mock.sortingandsearching;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 6, 8, 9 };
		System.out.println(search(a, 6));
	}

	public static int search(int[] a, int key) {
		if (a.length == 0)
			return -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}
}
