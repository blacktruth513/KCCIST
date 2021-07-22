package com.test5;
class A {
	int a;
	A() {
		a = 100;
		System.out.println("Default A Constructor");
	}	
	A(int a)  {
		this.a = a;
	}
}
class B extends A {
	int b;
	B() {
		System.out.println("Default B Constructor");
	}
	B(int b) {	
		super(500);		
		this.b = b;
		System.out.println(a + ", " + b);
	}
	void bMethod() { System.out.println(a); }
}
public class Test1 {
	public static void main(String[] args) {
//		B b = new B();
//		b.bMethod();
		B b2 = new B(300);
		b2.bMethod();
		
	}
}
