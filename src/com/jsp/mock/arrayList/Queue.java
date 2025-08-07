package com.jsp.mock.arrayList;

public class Queue {
	private Object[] a;
	private int position;

	public Queue() {
		a = new Object[5];
		position = 0;
	}

	public void add(Object e) {
		if (position == a.length)
			increase();
		a[position++] = e;
	}

	public Object peek() {
		if (position == 0)
			throw new IllegalStateException("Queue is empty");
		return a[0];
	}

	public Object poll() {
		if (position == 0)
			throw new IllegalStateException("Queue is empty.");
		Object temp = a[0];
		for (int i = 0; i < size() - 1; i++) {
			a[i] = a[i + 1];
		}
		position--;
		return temp;
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
