package com.test10;
abstract class A {
	abstract void aMethod();
}
public class Test1 {
	public static void main(String[] args) {
		A a = new A() {
			@Override
			void aMethod() {	}
		};
		a.aMethod();
	}
}
