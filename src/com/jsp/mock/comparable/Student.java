package com.jsp.mock.comparable;

public class Student implements Comparable {
	int roll;
	String name;
	int percentage;

	public Student(int roll, String name, int percentage) {
		super();
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Object e) {
		Student s = (Student) e;
		return this.name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", percentage=" + percentage + "]";
	}

}
