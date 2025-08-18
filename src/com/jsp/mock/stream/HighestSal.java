package com.jsp.mock.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSal {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		Double double1 = employees.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).findFirst()
				.map(Employee::getSal).get();
		System.out.println(double1);

	}
}
