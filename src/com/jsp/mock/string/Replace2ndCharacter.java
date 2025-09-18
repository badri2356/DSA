package com.jsp.mock.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Replace2ndCharacter {
	public static void main(String[] args) {
//		String s = "abcdefghijk";
//		s = s.replaceAll("(.{2}).", "$1*");
//		System.out.println(s);
		
		String s="AlokBirajPradhan";
		
		String result = IntStream.range(0, s.length())
                .mapToObj(i -> ((i + 1) % 2 == 0) ? "*" : String.valueOf(s.charAt(i)))
                .collect(Collectors.joining());

        System.out.println("Input : " + s);
        System.out.println("Output: " + result);
	}
}
