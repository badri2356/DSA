package com.jsp.mock.sortingandsearching;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 2,8,1,7,3,9,4,5};
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;

			System.out.println(Arrays.toString(a));
			System.out.println("=========");
		}
		System.out.println(Arrays.toString(a));
	}
}
