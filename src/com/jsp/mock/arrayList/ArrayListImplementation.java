package com.jsp.mock.arrayList;

import java.util.Arrays;

public class ArrayListImplementation {
	private Object[] a;
	private int position;

	public ArrayListImplementation() {
		a = new Object[5];
		position = 0;
	}

	public void add(Object e) {
		if (position == a.length)
			increase();
		a[position++] = e;
	}

	public void add(int index, Object e) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();

		if (position == a.length)
			increase();

		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		position++;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}

	public void increase() {
		Object[] temp = new Object[a.length + 3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a = temp;
	}

	public void remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		for (int i = index; i < size() - 1; i++) { // Fix loop condition
			a[i] = a[i + 1];
		}

		a[position - 1] = null;
		position--;
	}

	public int size() {
		return position;
	}
}
