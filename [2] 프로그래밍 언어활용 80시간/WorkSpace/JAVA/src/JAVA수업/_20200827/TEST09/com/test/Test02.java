package JAVA����._20200827.TEST09.com.test;

class MyClass2 {
	
	/*
	 * Static ������ ����ϴ� ����
	 * 1. ������ �����ؼ� ����ϰ� ���� ��
	 * 2. Static ������ �ʱ�ȭ �ϰ���� �� ���
	 */
	static int static_a;
	
	static {
		System.out.println("Static Block >> "+static_a);
	}
	
	public MyClass2() {
		// TODO Auto-generated constructor stub
		System.out.print("Default Contructor : ");
		static_a++;
		System.out.println("static_a = ["+static_a+"]");
	}
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		MyClass2 c1 = new MyClass2();
		@SuppressWarnings("unused")
		MyClass2 c2 = new MyClass2();
	}

}
