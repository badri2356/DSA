package com.jsp.mock.array;

import java.util.Arrays;

public class MoveNonZeroElements {
	public static void main(String[] args) {
		int[] a = { 1, 0, 4, 0, 2, 5, 6 };
		moveZero(a);
		System.out.println(Arrays.toString(a));
	}

	public static void moveZero(int[] a) {
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[index]=a[i];
				index++;
			}
		}
		for(int i=index;i<a.length;i++) {
			a[i]=0;
		}
	}
}
