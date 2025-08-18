package com.jsp.mock.stream;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstRepeatCharacter {
public static void main(String[] args) {
	String s="hlleo everyone";
	
	Character character = s.chars()
	.mapToObj(c->(char)c)
	.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
	.entrySet().stream()
	.filter(e->e.getValue()>1)
	.map(e->e.getKey())
	.findFirst()
	.get();
	System.out.println(character);
	}
}
