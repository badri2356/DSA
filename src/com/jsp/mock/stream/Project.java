package com.jsp.mock.stream;

public class Project {
	private int p_id;
	private String name;

	public Project(int p_id, String name) {
		super();
		this.p_id = p_id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Project [p_id=" + p_id + ", name=" + name + "]";
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
