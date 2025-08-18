package com.jsp.mock.stream;

import java.util.Comparator;
import java.util.List;

public class SortSalary {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
//		employees.forEach(System.out::println);
		employees.stream()
		.sorted(Comparator.comparingDouble(Employee::getSal).reversed())
		.map(Employee::getName)
		.forEach(System.out::println);
	}
}
