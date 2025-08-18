package com.jsp.mock.stream;

import java.util.List;

public class Employee {
	private int e_id;
	private String name;
	private String dept;
	private double sal;
	private String gender;
	private List<Project> projects;

	public Employee(int e_id, String name, String dept, double sal, String gender, List<Project> projects) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.gender = gender;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", gender=" + gender
				+ ", projects=" + projects + "]";
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
