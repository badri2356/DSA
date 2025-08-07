package com.jsp.mock.comparator;

import java.util.Arrays;

public class NameString {
	public static void main(String[] args) {
		String[] s = { "Badri", "Ajit", "Papun", "Rohit", "Barsa", "Sanju", "Aparna" };
		Arrays.sort(s, new CompareName());
		for (String st : s) {
			System.out.println(st);
		}
	}
}
