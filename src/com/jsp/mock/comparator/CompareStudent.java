package com.jsp.mock.comparator;

import java.util.Comparator;

public class CompareStudent implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s2.age - s1.age;
	}
}
