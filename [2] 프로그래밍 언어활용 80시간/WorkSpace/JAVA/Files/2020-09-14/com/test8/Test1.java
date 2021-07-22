package com.test8;
class MyClass {
	void aMethod() throws ArithmeticException{		
			int a = 10 / 0;
	}
}
public class Test1 {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		try {
			m.aMethod();
		} catch(ArithmeticException e) {
			System.out.println("Test");
		}
	}
}
