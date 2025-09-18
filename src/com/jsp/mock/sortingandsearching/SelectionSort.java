package com.jsp.mock.sortingandsearching;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 23, 54, 1, 253, 32 };
		System.out.println(Arrays.toString(sort(a)));
	}

	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}
}
