package JAVA����._20200828.TEST10.com.test05;

class A {
	void testMethod() {
		System.out.println("A");
	}
}

class B extends A{
	void testMethod() {
		System.out.println("A override");
	}
	
}

class C extends B{
//	void testMethod() {
//		System.out.println("A override override");
//	}
}

public class test {
	public static void main(String[] args) {
		A a = new C();
		System.out.println("C Ŭ������ �ִ� override�� testMethod�� �ּ�ó���ϸ�?");
		a.testMethod();
		System.out.println("B Ŭ������ �ִ� override�� testMethod�� ��µȴ�.");
	}
}
