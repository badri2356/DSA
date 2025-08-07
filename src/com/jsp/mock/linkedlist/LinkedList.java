package com.jsp.mock.linkedlist;

public class LinkedList {
	private Node first;
	private Node last;
	private int count;

	public LinkedList() {
		first = null;
		count = 0;
	}

	public void add(Object e) {
		if (first == null) {
			first = new Node(e);
			count++;
		} else {
			Node curr = first;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = new Node(e);
			count++;
		}
	}

	public void add(int index, Object e) {
		if (index < 0 || index > size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			first = new Node(e, first);
			count++;
			return;
		} else {
			Node curr = first;
			for (int i = 1; i < index; i++) {
				curr = curr.next;
			}
			curr.next = new Node(e, curr.next);
			count++;
		}

	}

	public void remove(int index) {
		if (index < 0 || index > size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			first = first.next;
			count--;
			return;
		} else {
			Node curr = first;
			for (int i = 1; i < index; i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
			count--;
		}
	}

	public Object get(int index) {
		if (index < 0 || index > size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			return first.ele;
		} else {
			Node curr = first;
			for (int i = 1; i <= index; i++) {
				curr = curr.next;
			}
			return curr.ele;
		}
	}

	public int size() {
		return count;
	}
}
