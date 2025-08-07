package com.jsp.mock.string;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String s1 = "god";
		String s2 = "dog";
		System.out.println(isAnagram(s1, s2));
		;

	}

	public static boolean isAnagram(String a1, String a2) {
		if (a1.length() != a2.length())
			return false;
		char[] a = a1.toCharArray();
		char[] b = a2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}
}