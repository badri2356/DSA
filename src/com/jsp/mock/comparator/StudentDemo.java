package com.jsp.mock.comparator;

import java.util.Arrays;

public class StudentDemo {
	public static void main(String[] args) {
		Student[] s = { new Student("Alok", 22), new Student("Badri", 24), new Student("Rahul", 21) };
		Arrays.sort(s, new CompareStudent());
		for (Student st : s) {
			System.out.println(st);
		}
	}
}
