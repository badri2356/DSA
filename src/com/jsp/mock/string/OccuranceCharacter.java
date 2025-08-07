package com.jsp.mock.string;

public class OccuranceCharacter {
	public static void main(String[] args) {
		String s = "Malayalam";
		while (s.length() > 0) {
			char ch = s.charAt(0);
			String str = s.replace(ch + "", "");
			int count = s.length() - str.length();
			System.out.println(ch + " = " + count);
			s = str;
		}
	}
}
