package com.jsp.mock.sortingandsearching;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 9,3,7,4,6,5,2 };
		System.out.println(Arrays.toString(a));

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
			System.out.println(Arrays.toString(a));
			System.out.println("=================");
		}
		System.out.println(Arrays.toString(a));
	}
}
