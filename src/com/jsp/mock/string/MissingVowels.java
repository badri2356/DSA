package com.jsp.mock.string;

public class MissingVowels {
	public static void main(String[] args) {
		String s = "badri";
		String str = "aeiou";
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!s.contains(c + "")) {
				st += c;
			}
		}
		System.out.println(st);
	}
}
