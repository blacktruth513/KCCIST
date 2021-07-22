package com.test7;
public class Test1 {
	public static void main(String[] args) {
		try {
		int[]  a = new int[5];
		a[5] = 30/0;
		} catch(ArithmeticException e) {
			System.out.println("By divide 0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		} catch(Exception e) {
			System.out.println("Others exceptions");
		}		
	}
}
