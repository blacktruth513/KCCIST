package com.test;

public class Test11 {

	public static void main(String[] args) {
		// int[] a = {1,2,3};
		// for(int i = 0; i <= a.length; i++) {
		// System.out.println(a[i]);
		// }
		int[][] arr = new int[2][2];
		arr[0][0] = 1;
		arr[1][0] = 2;
		arr[0][1] = 3;
		arr[1][1] = 4;
		// System.out.println(arr.length);
		for (int i = 0; i < 2; i++) {
			// System.out.println(arr[i][0] + "," + arr[i][1]);
			for (int j = 0; j < 2; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
		int[][]b= {{1,2},{3,4}};
		for (int i = 0; i < 2; i++) {
			// System.out.println(arr[i][0] + "," + arr[i][1]);
			for (int j = 0; j < 2; j++) {
				System.out.println(arr[i][j]);
	}
			int[][] c = new int[3][];
			c[0] = new int[1];
			c[1] = new int[2];
			c[2] = new int[3];
					
					c[0][0] = 100;
			c[1][0] = 200;
			c[1][1] = 300;
			System.out.println(c[0][0]);
			System.out.println(c.length);
			System.out.println(c[0].length + "," + c[1].length + "," + c[2].length);
		}
		
	}
}
