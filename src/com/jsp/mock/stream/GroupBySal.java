package com.jsp.mock.stream;

import java.util.List;
import java.util.stream.Collectors;

public class GroupBySal {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSal)))
				.entrySet().forEach(System.out::println);
	}
}
