package JAVA����._20200914.TEST11.com.test04;
/*
 * ����ȯ ����
 */

class Animal {
	void eating() {
		System.out.println("Animal Eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Animal Eating");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Animal Eating");
	}
}

public class Test01 {
	static Dog testMethod(Dog a) {
		return a;
	}
	static Cat testMethod2(Cat a) {
		return a;
	}
	static Animal testMethod3(Animal a) {
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.bark();
		d.eating();
		
		Animal a = d;
		a.eating();//Type�� Animal Ÿ���̱� ������ eating()�� ȣ�Ⱑ��
		
		Animal a2 = new Dog(); //���� ������ ���ٷ� ǥ��
		
		Cat c = new Cat();
		Animal a3 = c;
		
		Animal a4 = new Cat();
		a4.eating();
		
		Animal a5 = testMethod3(new Dog());
		((Dog)a5).eating();
		((Dog)a5).bark();
		Animal a6 = testMethod3(new Cat());
		((Cat)a5).eating();
		((Cat)a5).meow();
		
	}

}
