package com.jsp.mock.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindDuplicateInArray {
	public static void main(String[] args) {
		int[] a = { 2, 4, 2, 5, 3, 5, 6, 7, 5, 6 };

		Arrays.stream(a)
		.boxed()
		.collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()>1)
		.map(e->e.getKey())
		.forEach(System.out::println);
	}
}
