package com.test;

class MyClass {
	static int a = 0;
public MyClass() {
	a++;
	System.out.println(a);
}
public int test() {
	return a;
}
public static int test2() {
//	int c = b;
	return a;
}
}
public class Test1 {
	public static void main(String[] args) {
		MyClass c = new MyClass();
		MyClass c2 = new MyClass();
	}
}