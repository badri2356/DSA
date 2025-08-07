package com.jsp.mock.string;

public class Panagram {
	public static void main(String[] args) {
		String s = "A quick brown fox jumps over the lazy dog.";
		System.out.println(isPanagram(s));
	}

	public static boolean isPanagram(String str) {
		if (str.length() < 26)
			return false;
		String s = str.toLowerCase();
		for (char c = 'a'; c <= 'z'; c++) {
			if (!s.contains(c + ""))
				return false;
		}
		return true;
	}
}
