package com.jsp.mock.string;

public class Count {
	public static void main(String[] args) {
		String s = "abde2sf3lb5";
		int numCount = 0;
		int vowelCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vowelCount++;
			}
			if (ch >= '0' && ch <= '9') {
				numCount++;
			}
		}
		System.out.println("The total vowel character count is " + vowelCount);
		System.out.println("The total count of number is " + numCount);
	}

}
