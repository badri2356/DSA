package com.jsp.mock.string;

public class Reverse {
	public static void main(String[] args) {
		String s = "raveesh";
		String str="";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i) + " ";
		}
		System.out.println(str);
	}
}
