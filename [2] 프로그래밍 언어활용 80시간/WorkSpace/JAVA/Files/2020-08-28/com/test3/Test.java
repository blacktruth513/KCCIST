package com.test3;
class A{
	static int a = 200;	
}
class B extends A {
	B() { a = 300; }
}
public class Test {
	public static void main(String[] args) {
		System.out.println(A.a);
		B b = new B();
		System.out.println(b.a);

	}

}
