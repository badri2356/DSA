package com.jsp.mock.string;

public class RemovingExtraSpace {
	public static void main(String[] args) {
		String s = "Badri Narayan Padhy";
		char[] a = s.toCharArray();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ')
				continue;
			str += ch;
		}
		System.out.println(str);
	}
}
