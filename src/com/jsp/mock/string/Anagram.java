package com.jsp.mock.string;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		if (isAnagram(s1, s2))
			System.out.println("they are anagram");
		else
			System.out.println("they are not anagram");
	}

	public static boolean isAnagram(String a, String b) {
		while (true) {
			if (a.length() != b.length())
				return false;
			if (a.length() == 0 && b.length() == 0)
				return true;
			char ch = a.charAt(0);
			a = a.replace(ch + "", "");
			b = b.replace(ch + "", "");

		}
	}
}
