package JAVA����._20200827.TEST09.com.test7;

/*
 * Overloading 	:	Ŭ�������� �޼ҵ忡 ���õ� ��.
 * 					�̸��� �����ϰ� ����
 * 					�Ķ������ ������ Ÿ�Կ� ����ó�� �����ϵ��� ��
 * 
 * Overriding	:	Ŭ���� ��Ӱ���, ���� �޼ҵ��� �̸��� �������� ������ �ϴ� ��
 */

class Animal {
	void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal{
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
		Dog d = new Dog();
		d.eat();
		Animal a = new Animal();
		a.eat();
		
		Animal a1 =new Dog();
		a1.eat();//�������� method�� ���
		Animal a2 =new Cat();
		a2.eat();//�������� method�� ���
		
		System.out.println("==============");
		
		/*���� method�� ����ϴ��� �ٸ� ��°��� ���´�.*/
		test(new Dog());
		test(new Cat());
	}
}
