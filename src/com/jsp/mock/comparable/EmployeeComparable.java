package com.jsp.mock.comparable;

import java.util.Arrays;

public class EmployeeComparable {
	public static void main(String[] args) {
		Employee[] e = { new Employee(1, "Badri", 12000), new Employee(2, "Barsa", 21000),
				new Employee(3, "Rohit", 5000) };
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
	}
}
