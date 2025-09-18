package com.jsp.mock.array;

import java.util.Arrays;

public class SortMiddleElements {
	public static void main(String[] args) {
		int[] a = { 2, 5, 3, 7, 5, 9, 15 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a) {
		for (int i = 1; i < a.length - 2; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
