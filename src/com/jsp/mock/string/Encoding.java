package com.jsp.mock.string;

public class Encoding {
	public static void main(String[] args) {
		String s = "badri";
		System.out.println(encode(s, 10));
	}

	public static String encode(String s, int l) {
		char[] a = s.toCharArray();
		char[] letter = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = letter[((a[i] - 97) + l) % 26];
		}
		return new String(a);
	}
}
