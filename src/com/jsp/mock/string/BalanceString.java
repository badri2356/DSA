package com.jsp.mock.string;

public class BalanceString {
	public static void main(String[] args) {
		System.out.println(isBalanced("{}[]()"));
	}

	public static boolean isBalanced(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '[' || ch == ']' || ch == '(' || ch == ')' || ch == '{' || ch == '}')
				str += ch;
			while (str.contains("[]") || str.contains("()") || str.contains("{}")) {
				str = str.replace("[]", "");
				str = str.replace("()", "");
				str = str.replace("{}", "");

			}
		}
		return str.length() == 0;
	}
}
