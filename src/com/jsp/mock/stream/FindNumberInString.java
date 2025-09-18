package com.jsp.mock.stream;

public class FindNumberInString {
	public static void main(String[] args) {
		String s="He231llo1";
		
		s.chars()
		.mapToObj(c->(char)c)
		.filter(i->i>'0' && i<='9')
		.forEach(System.out::println);
	}
}
