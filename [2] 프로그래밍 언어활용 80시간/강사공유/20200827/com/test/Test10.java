package com.test;
class Animal3 { void eat() {} }
class Dog3 extends Animal3 { void bark() {} }
class Cat3 extends Animal3 { void meow() {} }
public class Test10 {
//	static void test(int age, String name....,....)
//	static void test(Student s)	
//	static void test2(Dog3 d)
//	static void test3(Cat3 c)
	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.bark(); d.eat();
		Animal3 a = d;
		Animal3 a2 = new Dog3();
		Animal3 c2 = new Cat3();
		Object o = a2;
	}
}
