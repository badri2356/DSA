package com.jsp.mock.stream;

import java.util.Comparator;
import java.util.List;

public class NthHighetSal {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		int n=2;
		Double double1 = employees.stream()
		.sorted(Comparator.comparing(Employee::getSal).reversed())
		.skip(n- 1)
		.findFirst().map(Employee::getSal).get();
		System.out.println(double1);
	}
}
