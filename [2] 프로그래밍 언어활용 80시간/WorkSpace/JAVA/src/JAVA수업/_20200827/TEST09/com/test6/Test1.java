package JAVA����._20200827.TEST09.com.test6;

class A {
	int a;
	A() {
		
	}
	A(int a) {
		this.a = a;
	}
}

class B extends A{
	int b;
	B() {
		
	}
	
	B(int b) {
		super(100);
		/*
		 * 1. super(100)�� ������ �θ� Ŭ������ Default �����ڸ� ������ ȣ���ϰ� �ȴ�. 
		 * 		�� ��� �θ�Ŭ�������� Default �����ڰ� ������ ��������
		 * 2. �������� �����ε����� ���� Ŭ�������� super(100)�� �����ؼ� �θ� Ŭ����(A(int a))��ȣ���ϰ� �Ǹ�
		 * 		�θ�Ŭ������ Default �����ڸ� ȣ������ �ʱ� ������ ������ ������ �ʴ´�.
		 */
		this.b = b;
	}

}

public class Test1 {
	public static void main(String[] args) {
		B b = new B(100);
		System.out.println(b.a + ", "+b.b);
	}
}
