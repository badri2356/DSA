package com.jsp.mock.array;

import java.util.Arrays;
import java.util.Comparator;

import com.jsp.mock.comparator.CompareName;

public class FindNthlargestNum {
	public static void main(String[] args) {
		int []a= {2,5,1,7,4,8,9};
		System.out.println(Arrays.toString(reverseOrder(a)));
		int n=3;
		System.out.println(a[n-1]);
	}
	public static int[] reverseOrder(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}
