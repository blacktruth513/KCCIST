package JAVA����._20200916.TEST13.com.test10;
/**
 * 
 * ���� Ŭ���� (inner Class)
 *
 */

abstract class A {
	abstract void aMethod();
}

class B extends A {
	@Override
	void aMethod() {
	}
}

public class Test01 {
	public static void main(String[] args) {
		/*
		 * ��ȸ�� �뵵�� ����ϱ� ���� ����
		 */
		A a = new A() {
			
			@Override
			void aMethod() {
				
			}
		};
		
		a.aMethod();
	}
}
