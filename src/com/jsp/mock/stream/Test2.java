package com.jsp.mock.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {

		List<Employee> employees = EmployeeDatabase.getAllEmployees();
//
//		employees.stream().forEach(System.out::println);
//		employees.forEach(e -> System.out.println(e.getName() + " " + e.getSal()));
//	List<Employee>employeeDevp=employees.stream().filter(e->e.getDept().equals("Devlopment")).collect(Collectors.toList());
//		System.out.println(employeeDevp);
//	}
		List<String> dept = employees.stream().map(Employee::getDept).collect(Collectors.toList());
		System.out.println(dept);
	}
}