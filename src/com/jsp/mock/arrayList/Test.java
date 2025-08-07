package com.jsp.mock.arrayList;

public class Test {
	public static void main(String[] args) {
//		ArrayListImplementation a = new ArrayListImplementation();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		a.add(60);
//		a.add(70);
//		a.remove(1);
//		for (int i = 0; i < a.size(); i++) {
//			System.out.println(a.get(i));
//		}
		Queue e = new Queue();
		e.add(10);
		e.add(20);
		e.add(30);
		System.out.println(e.poll());
		System.out.println(e.peek());
	}
}
