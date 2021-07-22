package com.test14;
public class Test1 {
	public static void main(String[] args) {
		int a = 1;		
		Integer a2 = new Integer(10); // boxing
		System.out.println(a + ", " + a2);
		int a3 = a2.intValue();
		Integer a4 = 12; // auto boxing
		
		Integer b = new Integer(10);
		Integer b2 = new Integer(20);
		Integer c = b + b2;
		System.out.println(c);
		
		Integer a5 = new Integer(20);
		int a6 = a5; // auto unboxing
		
		
	}
}
