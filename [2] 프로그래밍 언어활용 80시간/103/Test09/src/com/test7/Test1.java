// Overloading : Ŭ�������� �޼ҵ忡 ���õ� ����. �̸��� �����ϰ� ����
// �Ķ������ ������ Ÿ�Կ� ����ó�� �����ϵ��� ��.
//Overriding: Ŭ���� ��Ӱ���, ���� �޼ҵ� �̸��� �������� ������ �ϴ� ��.
package com.test7;

class Animal {
	void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog eat");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat eat");
	}
}

public class Test1 {
	static void test(Animal a) {
		a.eat();
	}

	public static void main(String[] args) {
		test(new Dog());
		test(new Cat());
		Dog d = new Dog();
		d.eat();
		Animal a = new Animal();
		a.eat();
		Animal a1 = new Dog();
		a1.eat();
		Animal a2 = new Cat();
		a2.eat();
	}
}