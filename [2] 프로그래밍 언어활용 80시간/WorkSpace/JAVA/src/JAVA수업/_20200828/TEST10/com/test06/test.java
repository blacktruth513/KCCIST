package JAVA����._20200828.TEST10.com.test06;
class A {
	
}
class B extends A{
	
}

public class test {

	public static void main(String[] args) {
		/*
		 * instanceof : ��ü�񱳽� ��Ӱ���� true�� ��ȯ, ����ȯ ����
		 */
		A a = new A();
		System.out.println(a instanceof A);
		B b = new B();
		System.out.println(b instanceof A);
		B b2 = null;
		System.out.println(b2 instanceof A);
		
	}

}
