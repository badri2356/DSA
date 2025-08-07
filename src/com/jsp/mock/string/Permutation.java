package com.jsp.mock.string;

public class Permutation {
	public static void main(String[] args) {
		String s = "abc";
		permutation(s, 0, s.length() - 1);
	}

	public static void permutation(String s, int start, int end) {
		if (start >= end) {
			System.out.println(s);
			return;
		}
		for (int i = start; i <= end; i++) {
			String str = swap(s, start, i);
//			System.out.println(s);
			permutation(str, start + 1, end);
		}
	}

	public static String swap(String s, int i, int j) {
		char[] ch = s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
	}
}
