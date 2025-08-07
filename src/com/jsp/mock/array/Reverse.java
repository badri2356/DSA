package com.jsp.mock.array;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		int b[] = reverse(a, 0, a.length - 1);
		System.out.println(Arrays.toString(b));

	}

	public static int[] reverse(int[] a, int i, int j) {
		if (i > j)
			return a;
		if (i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return reverse(a, i + 1, j - 1);
	}
}