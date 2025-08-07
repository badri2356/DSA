package com.jsp.mock.sortingandsearching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(search(a, 0, a.length - 1, 1));
	}

	public static int search(int[] a, int i, int j, int key) {
		if (i > j)
			return -1;
		int mid = (i + j) / 2;
		if (a[mid] == key)
			return mid;
		if (key < a[mid])
			return search(a, i, mid - 1, key);
		return search(a, mid + 1, j, key);
	}
}
