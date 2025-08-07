package com.jsp.mock.string;

public class RemoveDuplicateLetter {
	public static void main(String[] args) {
		String s = "Malayalam";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!str.contains(ch + "")) {
				str += ch;
			}
		}
		System.out.println(str);
	}
}
