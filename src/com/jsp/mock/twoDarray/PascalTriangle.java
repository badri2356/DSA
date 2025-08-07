package com.jsp.mock.twoDarray;

public class PascalTriangle {
	public static void main(String[] args) {
		int n = 5;
		int[][] a = new int[n][];
		pascal(a);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] pascal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || j == i) {
					a[i][j] = 1;
				} else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		return a;
	}
}
