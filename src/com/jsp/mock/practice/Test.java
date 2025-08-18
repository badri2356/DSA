package com.jsp.mock.practice;

public class Test {
	public static void main(String[] args) {
		boolean flag=true;
		int i=0;
		while(flag) {
			i++;
			if(i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 && i%7==0 && i%8==0 && i%9==0 ) {
				System.out.println(i);
				flag=false;
			}
			}
	}
}