package com.jsp.mock.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println(n + " is a prime number.");
		} else
			System.out.println(n + " is not a prime number.");
	}
}
