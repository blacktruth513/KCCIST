package JAVA����._20200826.TEST08.com.test;

//��ü �����Ҷ����� Count
class MyClass{
	static int a = 10;
	
}

public class Test14 {
	public static void main(String[] args) {
		/*
		 *Static ������ instace �����ؼ� ������ �����ϴ�.
		 *	1.static ����
		 *	2.instance���� �Ѵ� ����
		 */
		System.out.println(MyClass.a);
		MyClass.a = 100;
		System.out.println(MyClass.a);

		MyClass b = new MyClass();
		System.out.println(b.a);
		b.a = 1000;
		System.out.println(MyClass.a);
	}
}
