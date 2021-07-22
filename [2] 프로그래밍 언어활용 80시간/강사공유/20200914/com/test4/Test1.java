package com.test4;
class Animal { void eat() { System.out.println("Animal Eating"); } }
class Dog extends Animal { void bark() { System.out.println("Animal Eating"); } }
class Cat extends Animal { void meow() { System.out.println("Animal Eating"); } }
public class Test1 {
    static Dog testMethod(Dog d) { return d;}
    static Cat testMethod2(Cat d) { return d;}
	static Animal testMethod3(Animal a) { return a;}	
	public static void main(String[] args) {
		Animal a5 = testMethod3(new Dog());
		((Dog)a5).eat();
		((Dog)a5).bark();
		Animal a6 = testMethod3(new Cat());
		((Cat)a6).eat();
		((Cat)a6).meow();
//		Dog d = new Dog();
//		Animal a = d;
//		a.eat();
//		Animal a2 = new Dog();
//		a2.eat();
//		Cat c = new Cat();
//		Animal a3 = c;
//		a3.eat();
		Animal a4 = new Cat();
		a4.eat();
	}
}
