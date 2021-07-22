package com.test;
class A{
	public void aMethod() { System.out.println("AMethod"); }
}
public class Test4 {
	static void test(A a) { 
		a.aMethod();
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.aMethod();
		A a2 = new A();
		a2.aMethod();
		test(a1);
		test(a2); // A a = a2
		test(new A()); // A a = new A()
	}
	
}