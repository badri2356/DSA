package com.jsp.mock.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConsonentVowelCountInString {
	public static void main(String[] args) {
		String s = "Badri Narayan Padhy";
		vowel(s);
		consonent(s);

	}

	public static void vowel(String s) {
		s = s.toUpperCase();
		HashMap<Character, Integer> map = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			}
		}

		map.entrySet().forEach(System.out::println);

	}

	public static void consonent(String s) {
		s = s.toUpperCase();
		HashMap<Character, Integer> map1 = new HashMap();
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ')
				continue;
			if (!isVowel(s.charAt(i))) {
				map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
			}
		}
		map1.entrySet().forEach(System.out::println);
	}

	public static boolean isVowel(char c) {
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
}
