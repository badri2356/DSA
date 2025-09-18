package com.jsp.mock.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStringInList {
	public static void main(String[] args) {
		String []words= {"Badri","Alok","Padhy","Badri","Alok","Padhy"};
		
		List<String> list = Arrays.stream(words)
		.distinct()
		.collect(Collectors.toList());
		System.out.println(list);
	}
}
