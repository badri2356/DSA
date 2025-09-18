package com.jsp.mock.sortingandsearching;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 3, 5, 12, 53, 12, 59, 933 };
		System.out.println(Arrays.toString(sort(a)));
	}

	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
}
