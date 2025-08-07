package com.jsp.pattern;

public interface C {
	default void show() {
		System.out.println("C-interface");
	}
}
