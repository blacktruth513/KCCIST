package com.test7;

class Animal {
}

class Dog extends Animal {
	static void testMethod(Animal a) {
		if (a instanceof Dog) {
			Dog d = (Dog)a;
			System.out.println("O.K");
		}
	}

	public class Test1 {
		public static void main(String[] args) {
			Animal a = new Dog();
			Dog.testMethod(a);
			// Dog d = new Animal();
			// Dog.testMethod(d);
		}
	}
}
