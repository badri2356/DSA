package com.jsp.mock.sortingandsearching;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 3, 6, 2, 6, 1, 788, 97 };

		System.out.println(Arrays.toString(sort(a)));
	}

	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		return a;
	}
}