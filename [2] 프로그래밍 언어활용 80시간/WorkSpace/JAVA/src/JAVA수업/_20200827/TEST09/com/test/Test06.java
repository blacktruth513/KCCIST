package JAVA����._20200827.TEST09.com.test;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
	@SuppressWarnings("unused")
	private void privateMethod() {
		System.out.println("���������ڰ� private �̸� ����� �Ǵ��� ������ ���� �ʴ´�.");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}
/*
 *	���� ����
 *	������ Ŭ�������� ����� �޾� ������ �ڵ带 ����
 */
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
//		bd.privateMethod(); //private�� ���� �Ұ�
		
	}

}
