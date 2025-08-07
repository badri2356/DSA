package com.jsp.mock.string;

public class InitCap {
	public static void main(String[] args) {
		String s = "allu 123 arjun";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 || ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
			}
		}
		System.out.println(new String(ch));
	}
}