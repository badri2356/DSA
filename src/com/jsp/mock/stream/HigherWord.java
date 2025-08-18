package com.jsp.mock.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HigherWord {
	public static void main(String[] args) {
		String [] s= {"badri","rakesh","sanatan","sangram","rudrabhisek"};
		
		String c=Arrays.stream(s)
		.sorted(Comparator.comparing(String::length).reversed())
		.findFirst()
		.get();
		System.out.println(c);
	}
}
