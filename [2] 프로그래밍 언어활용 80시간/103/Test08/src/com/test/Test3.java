package com.test;
class Animal{
	public void breath() {System.out.println("Animal breath");}
}
class Dog extends Animal {
	
}
public class Test3 {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.breath();
		Dog d = new Dog();
		d.breath();
	}
}