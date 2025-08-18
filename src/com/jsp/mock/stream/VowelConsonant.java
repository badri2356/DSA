package com.jsp.mock.stream;

import java.util.Comparator;

public class VowelConsonant {
public static void main(String[] args) {
	String s="Badri Narayan Padhy";
	
	s.chars()
	.mapToObj(c->(char)c)
	.filter(i->i=='a' || i=='e' || i=='i' || i=='o' || i=='u')
	.forEach(System.out::print);
	
	s.chars()
	.mapToObj(c->(char)c)
	.filter(i->!(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'))
	.forEach(System.out::print);
	
}
}
