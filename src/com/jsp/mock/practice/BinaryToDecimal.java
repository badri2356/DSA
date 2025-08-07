package com.jsp.mock.practice;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		System.out.println("hello");

		int decimal = 0, power = 0;
		while (binary > 0) {
			int last = binary % 10;
			decimal += last * Math.pow(2, power);
			power++;
			binary /= 10;

		}
		System.out.println(decimal);
	}
}
