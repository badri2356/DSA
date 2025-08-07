package com.jsp.mock.string;

public class Test {
	public static void main(String[] args) {
		String s = "aaabbcdd";
		String str = "";
		char[] a = s.toCharArray();
		int i = 0;
		char c;
		int count;
		while (i < a.length) {
			c = a[i];
			count = 1;
			i++;
			while (i < a.length && a[i] == c) {
				count++;
				i++;
			}
			str = str + count + c;
		}
		System.err.println(str);
	}
}
