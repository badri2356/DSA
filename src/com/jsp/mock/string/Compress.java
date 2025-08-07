package com.jsp.mock.string;

public class Compress {
	public static void main(String[] args) {
		System.out.println(compress("abbcccdddd"));
	}

	public static String compress(String s) {
		String str = "";
		int count = 1;
		char prev = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == prev)
				count++;
			else {
				str = str + prev + count;
				prev = s.charAt(i);
				count = 1;
			}
		}
		str = str + prev + count;
		return str;
	}
}