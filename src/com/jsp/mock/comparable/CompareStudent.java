package com.jsp.mock.comparable;

import java.util.Arrays;

public class CompareStudent {
	public static void main(String[] args) {
		Student[] s = { new Student(1, "Shradhanjali", 92), new Student(2, "Geeta", 78), new Student(3, "Rekha", 90) };
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}
}
