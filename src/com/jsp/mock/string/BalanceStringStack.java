package com.jsp.mock.string;

import java.util.Stack;

public class BalanceStringStack {
	public static void main(String[] args) {
		System.out.println(isBalanced("(}{)"));
	}

	public static boolean isBalanced(String s) {
		Stack<Character> st = new Stack<Character>();
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '{' || a[i] == '[' || a[i] == '(')
				st.push(a[i]);
			else if (a[i] == '}' || a[i] == ']' || a[i] == ')') {
				if (st.isEmpty() || !isPair(st.pop(), a[i]))
					return false;
			}
		}
		return st.isEmpty();
	}

	public static boolean isPair(char a, char b) {
		if (a == '[' && b == ']')
			return true;
		if (a == '{' && b == '}')
			return true;
		if (a == '(' && b == ')')
			return true;
		else
			return false;
	}
}
