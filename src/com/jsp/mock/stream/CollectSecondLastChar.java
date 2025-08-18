package com.jsp.mock.stream;

import java.util.Comparator;

public class CollectSecondLastChar {
	public static void main(String[] args) {
		String s = "Badri";
		int n = 2;

		Character character = s.chars().mapToObj(f -> (char) f).skip(s.length() - n).findFirst().get();
		System.out.println(character);
	}
}
