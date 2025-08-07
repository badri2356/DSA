package com.jsp.mock.array;

public class LargesNumber {
	public static void main(String[] args) {
		int[] a = { 3, 6, 2, 8, 5, 9 };
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);
	}
}
