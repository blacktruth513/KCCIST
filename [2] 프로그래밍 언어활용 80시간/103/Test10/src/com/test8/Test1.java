package com.test8;

class A extends Object {
	public String toString() {
		System.out.println(super.toString());
		return "안녕하세요";
	}

}

class B extends A {
	public String toString() {
		return "반가워요";
	}
}

public class Test1 {
	public static void main(String[] args) {

		A a = new A();
		System.out.println(a);
		A a2 = new B();
		System.out.println(a2);
	}

}
