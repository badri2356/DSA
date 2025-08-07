package com.jsp.mock.string;

public class SwapFirstString {
	public static void main(String[] args) {
		String s = "Badri Narayan Padhy";
		String b = "";
		int i = 0;
		char[] a = s.toCharArray();
		while (i < a.length) {
			String str = "";
			while (i < a.length && a[i] != ' ') {
				str += a[i];
				i++;
			}
			b += swap(str) + " ";
			i++;
		}
		System.out.println(b);
	}

	public static String swap(String s) {
		char[] a = s.toCharArray();
		int i = 0;
		int j = a.length - 1;
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return new String(a);
	}
}
