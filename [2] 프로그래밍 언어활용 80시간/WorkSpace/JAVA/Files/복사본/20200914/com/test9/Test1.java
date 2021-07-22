package com.test9;
class MyClass {
	void aMethod() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
}
public class Test1 {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		try {
			m.aMethod();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
//		try {
//			throw new ArithmeticException();
//		} catch(ArithmeticException e) {
//			System.out.println("Divide by 0");
//		}
	}
}
