package com.jsp.mock.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountFrequencyOfEachWord {
	public static void main(String[] args) {
		String [] words= {"badri","rahul","rohit","badri","rohit","rohit","badri","naresh"};
		
		 Arrays.stream(words)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}
}
