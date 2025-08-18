package com.jsp.mock.exceptionHandling;

public class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
class DataNotFoundException extends RuntimeException{
	public DataNotFoundException(String message) {
			super(message);
	}
}