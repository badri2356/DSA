package com.jsp.mock.arrayList;

public class Stack {
	private Object[] a;
	private int position;

	public Stack() {
		a = new Object[5];
		position = 0;
	}

	public void push(Object e) {
		if (position == a.length)
			increase();
		a[position++] = e;
	}

	public Object pop() {
		if (size() == 0)
			throw new IllegalStateException("Empty Stack");
		return a[--position];
	}

	public Object peek() {
		if (size() == 0)
			throw new IllegalStateException("Stack is Empty");
		return a[position-1];
	}

	public int size() {
		return position;
	}

	public void increase() {
		Object[] temp = new Object[a.length + 3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a = temp;
	}
}
