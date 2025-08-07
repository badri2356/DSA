package com.jsp.mock.twoDarray;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
		int[][] b = { { 2, 3, 4 }, { 2, 6, 3 }, { 1, 6, 3 } };
		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (int[] row : c) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
