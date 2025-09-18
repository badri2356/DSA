package com.jsp.mock.string;

import java.lang.classfile.instruction.CharacterRange;

public class ReverseOnlyCharacters {
	public static void main(String[] args) {
		String s = "unmi$d!fs@A&";

		System.out.println(reverseOnlyLetters(s));

	}

	public static String reverseOnlyLetters(String s) {
		
		char[] cs = s.toCharArray();
		
		int st=0; int end=cs.length-1;
		
		while(st<=end) {
			while((st<end) && !(Character.isLetter(cs[st]))) st++;
			while((st<end) && !(Character.isLetter(cs[end]))) end--;
			
			char c=cs[st];
			cs[st]=cs[end];
			cs[end]=c;
			st++;
			end--;
		}
		return new String(cs);
	}
}