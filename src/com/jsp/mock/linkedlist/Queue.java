package com.jsp.mock.linkedlist;

public class Queue {
	private Node first;
	private Node last;
	private int count;

	public void add(Object e) {
		Node newnode = new Node(e);
		if (first == null) {
			first = newnode;
			last = newnode;
		} else {
			last.next = newnode;
			last = newnode;
		}
		count++;
	}

	public Object peek() {
		if (count == 0)
			throw new IllegalStateException("Queue is Empty");
		return first.ele;
	}

	public Object poll() {
		if (count == 0)
			throw new IllegalStateException("Queue is Empty");
		Object temp = first.ele;
		first = first.next;
		return temp;
	}
	public int size() {
		return count;
	}
}
