package com.jsp.mock.string;

public class ReverseEveryword {
	public static void main(String[] args) {
		String s = "Badri narayan padhy";
		String b = "";
		char[] a = s.toCharArray();
		int i = 0;
		while (i < a.length) {
			String str = "";
			while (i < a.length && a[i] != ' ') {
				str += a[i];
				i++;
			}
			i++;
			b += reverse(str) + " ";
		}
		System.out.println(b);
	}

	public static String reverse(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;
	}

}
