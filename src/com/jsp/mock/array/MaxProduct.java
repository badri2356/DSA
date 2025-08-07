package com.jsp.mock.array;

import java.util.Arrays;

public class MaxProduct {
	public static void main(String[] args) {
		int[] a = { 2, 5, 1, 8, 5, -9, -9 };
		Arrays.sort(a);
		int first = a[a.length - 1];
		int second = a[a.length - 2];

		int third = a[0];
		int fourth = a[1];

		int product2 = third * fourth;

		int product = first * second;
		System.out.println(Math.max(product2, product));
	}

}
