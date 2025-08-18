package com.jsp.mock.stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestInArray {
public static void main(String[] args) {
	int []a= {4,3,7,5,9,1};
	int n=2;
	Integer integer = Arrays.stream(a)
	.boxed() // for make integer
	.sorted(Comparator.reverseOrder()	)
	.skip(n-1)
	.findFirst().get();
	System.out.println(integer);
}
}
