package com.jsp.mock.string;

public class PallindromeInPallindrome {
	public static void main(String[] args) {
		String s = "malayalam"
				+ "";
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isPallindrome(s, i, j))
					System.out.println(s.substring(i, j + 1));
			}
		}
	}

	public static boolean isPallindrome(String s, int i, int j) {
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
