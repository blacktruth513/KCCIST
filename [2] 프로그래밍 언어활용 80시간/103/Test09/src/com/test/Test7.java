package com.test;

class A{
	A(){System.out.println("Default A Constructor");}
void aMethod() { System.out.println("aMethods"); }
}
class B extends A {
	B(){ System.out.println("Default B Constructor");}
}
class C extends B {
	C() {System.out.println("Default C Contructor"); }
}
public class Test7 {
	public static void main(String[] args) {
		// A a = new A();
		B b = new B();
b.aMethod();
	}
}
