package com.test;

public class Test5 {
	public static void main(String[] args) {
		int[] a2;
		a2 = new int[5];
		int[] a = new int[5];
		// int a2[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		System.out.println(a[0]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
