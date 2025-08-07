package com.jsp.mock.comparable;

public class Test {
	int j = 0;
	float k = 0;

	public int add1(int a, int b) {
		return a + b;
	}

	public float add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.j = t.add1(2, 3);
		t.k = t.add(2, 3);
		System.out.println(t.j);
		System.out.println(t.k);

	}

}
