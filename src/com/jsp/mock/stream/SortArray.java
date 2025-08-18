package com.jsp.mock.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortArray {
	public static void main(String[] args) {
		int[] a = { 4, 2, 7, 3, 5 };
		int[] array = Arrays.stream(a).sorted().toArray();
		String s="Hello";
		
		s.chars()
		.mapToObj(c ->(char)c )
		.collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet()
		.forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
	}
}
