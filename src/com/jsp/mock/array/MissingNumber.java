package com.jsp.mock.array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 5,6,8 };
		int n = arr.length + 1;
		int avg = (n * (n + 1)) / 2;
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		System.out.println("The missing number is: " + (avg - sum));
	}
}
