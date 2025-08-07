package com.jsp.mock.linkedlist;

public class Test {
	public static void main(String[] args) {
//		LinkedList l = new LinkedList();
//		l.add(10);
//		l.add(20);
//		l.add(30);
//		l.add(40);
//		l.add(4, 50);
//		l.remove(0);
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i));
//		}
		Queue e = new Queue();
		e.add(10);
		e.add(20);
		e.add(30);
		e.poll();
		System.out.println(e.peek());
		
	}
}
