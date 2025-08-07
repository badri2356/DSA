package com.jsp.mock.linkedlist;

public class Stack {
	private Node first;
	private Node last;
	private int count;

	public void push(Object e) {
		Node newnode = new Node(e);
		if (first == null) {
			first = newnode;
			last = newnode;
		} else {
			newnode.next = first;
			first = newnode;
		}
		count++;
	}
}
