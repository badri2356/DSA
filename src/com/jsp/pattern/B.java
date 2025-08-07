package com.jsp.pattern;

public interface B {
	default void show() {
		System.out.println("B-interface");
	}
}
