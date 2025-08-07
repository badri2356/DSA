package com.jsp.mock.practice;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n = sc.nextInt();
		System.out.println("Enter the second number");
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) {
			if (prime(i)) {
				System.out.println(i);
			}

		}
	}

	public static boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
