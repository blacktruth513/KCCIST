package com.test;
class MyClass2{
	static int a; 
	static{
		a=10; 
		System.out.println("Static Block");
		
	}
		
	MyClass2(){
		System.out.println("Default Constructor");
		a++;
		System.out.println(a);
	}
}
public class Test2{
	public static void main(String[] args) {
		MyClass2 c = new MyClass2();
	}
}

