package com.jsp.mock.string;

public class Add {
	public static void main(String[] args) {
		String s = "2b3nd3m5ks3o8";
		System.out.println(add(s));
	}

	public static int add(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch <= '9' && ch >= '0') {
				sum += Integer.parseInt(ch + "");
			}
		}
		return sum;
	}
}
