package com.jsp.mock.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static boolean isAnagram(String str1, String str2) {

		while (!str1.isEmpty()) {
			char c = str1.charAt(0);
			str1 = str1.replace(c + "", "");
			str2 = str2.replace(c + "", "");
			if (str1.length() != str2.length()) {
				return false;
			}
		}
		return true;
	}

	public static List<List<String>> res(List<String> list) {

		Map<String, List<String>> map = new HashMap();
		for (String str : list) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String s = new String(chars);
			map.computeIfAbsent(s, t -> new ArrayList<String>()).add(str);
		}
		return new ArrayList<>(map.values());
	}

	public static List<List<String>> resStream(List<String> list) {
        return new ArrayList<>(
                list.stream()
                        .collect(Collectors.groupingBy(
                                str -> {
                                    char[] chars = str.toCharArray();
                                    Arrays.sort(chars);
                                    return new String(chars);
                                }
                        ))
                        .values()
        );
    }

	public static void main(String[] args) {
		List<String> list = List.of("listen", "tan", "silent", "nat");
//		System.out.println(isAnagram("silent", "listen"));
		System.out.println(resStream(list));
	}
}
