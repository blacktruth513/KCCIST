package com.test5;

class A {
	void testMethod() {
		System.out.println("A");
	}
}

class B extends A {
	void testMethod() {
		System.out.println("A override");
	}
}

class C extends B {
	// void testMethod() {System.out.println("A override override");}
// ���� Ŭ������ �޼��带 ���� Ŭ�������� ������, ���� Ŭ�������� ������ �� �޼��尡 ����Ŭ������ �޼��庸�� �켱
}

public class Test1 {
	public static void main(String[] args) {
		A a = new C();
		a.testMethod();
	}

}
