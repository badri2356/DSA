package com.jsp.mock.stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

	public static List<Employee> getAllEmployees() {
		Project p1 = new Project(1, "Alpha");
		Project p2 = new Project(2, "Bita");
		Project p3 = new Project(3, "Gama");
		Project p4 = new Project(4, "Delta");

		Employee e1 = new Employee(101, "Raveesh", "Devlopment", 20000, "female", Arrays.asList(p1, p2));
		Employee e2 = new Employee(102, "Badri", "Testing", 30000, "male", Arrays.asList(p3));
		Employee e3 = new Employee(103, "Alok", "Sales", 40000, "female", Arrays.asList(p4));
		Employee e4 = new Employee(104, "Sanatan", "Sales", 50000, "male", Arrays.asList(p1));
		return Arrays.asList(e3, e2, e4, e1);
	}
}
