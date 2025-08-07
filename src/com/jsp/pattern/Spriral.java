package com.jsp.pattern;

public class Spriral {
	public static void main(String[] args) {
		int[][] spiral = spiral(5);

		for (int[] temp : spiral) {
			for (int n : temp) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

	public static int[][] spiral(int n) {
		int[][] a = new int[n][n];
		int r = 0;
		int c = -1;
		char dir = 'r';
		for (int i = 1; i <= n * n; i++) {
			switch (dir) {
			case 'r':
				c++;
				a[r][c] = i;
				if (c == n - 1 || a[r][c + 1] != 0)
					dir = 'd';
				break;
			case 'd':
				r++;
				a[r][c] = i;
				if (r == n - 1 || a[r + 1][c] != 0)
					dir = 'l';
				break;
			case 'l':
				c--;
				a[r][c] = i;
				if (c == 0 || a[r][c - 1] != 0)
					dir = 'u';
				break;
			case 'u':
				r--;
				a[r][c] = i;
				if (r == 0 || a[r - 1][c] != 0)
					dir = 'r';
				break;
			}
		}
		return a;
	}
}
