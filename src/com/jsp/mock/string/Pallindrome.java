package com.jsp.mock.string;

public class Pallindrome {
	public static void main(String[] args) {
		String s = "anana";
		System.out.println(isPallindrome(s));
	}

	public static boolean isPallindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
