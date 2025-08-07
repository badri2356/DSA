package com.jsp.mock.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringPair {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap();
		System.out.println("Enter the number of String pair: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter your key: ");
			String key = sc.nextLine();
			System.out.println("Enter your value: ");
			String value = sc.nextLine();

			map.put(key, value);
		}

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
