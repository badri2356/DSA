package com.jsp.mock.string;

public class Sum {
	public static void main(String[] args) {
		String s = "b12c5d13";
		int i = 0;
		int sum = 0;

		while (i < s.length()) {
			char ch = s.charAt(i);
			String temp = "";

			if (ch >= '0' && ch <= '9') {
				temp += ch;
				i++;

				while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					temp += s.charAt(i);
					i++;
				}

				if (temp.length() > 0) {
					sum += Integer.parseInt(temp);
				}
			}
			i++;

		}
		System.out.println("The sum of the digits is: " + sum);
	}
}
