package com.jsp.mock.practice;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int decimal = sc.nextInt();
		String binary = "";
		while (decimal > 0) {
			int reminder = decimal % 2;
			binary = reminder+binary;
			decimal /= 2;
		}
		System.out.println(binary);
	}
}
