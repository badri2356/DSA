package com.jsp.mock.exceptionHandling;

class CustomException{
	public void addAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age must be above 18");
		}
		System.out.println("Registered");
	}
	public void addData(int id) {
		if(id<0) {
			throw new DataNotFoundException("Data is not valid");
		}
		System.out.println("Added succesfully");
	}
	public static void main(String[] args) {
		CustomException e=new CustomException();
		e.addData(9);
		try {
			e.addAge(18);
		} catch (InvalidAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
