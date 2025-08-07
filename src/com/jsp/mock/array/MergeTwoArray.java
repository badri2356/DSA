package com.jsp.mock.array;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7 };
		int[] b = { 2, 4, 6, 8 };
		int[] c = new int[a.length + b.length];
		c = merge(a, b, c);
		System.out.println(Arrays.toString(c));
	}

	public static int[] merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else
				c[k++] = b[j++];
		}
		while (i < a.length)
			c[k++] = a[i++];

		while (j < b.length)
			c[k++] = b[j++];
		return c;
	}
}
