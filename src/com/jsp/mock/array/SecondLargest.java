package com.jsp.mock.array;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a = { 5, 5, 4, 3, 2 };

		int largest = a[0];
		int secondLargest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (secondLargest == largest || a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		System.out.println(secondLargest);
	}
}
