package JAVA����._20200827.TEST09.com.test;

class MyClass {
	int a = 0;
	static int static_a = 0;
	
	public MyClass () {
		a++;
		static_a++;
		System.out.println("a :"+a);
		System.out.println("static_a :"+static_a);
	}
	
	public int test_a() {
		return a;
	}
	
	public static int test_a2() {
//		int c = a;// ����ƽ ������ �ν��Ͻ��� ����� �� ����.
		return static_a;
	}
	
	public int test_static_a() {
		return static_a;
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		MyClass c1 = new MyClass();
		@SuppressWarnings("unused")
		MyClass c2= new MyClass();
	}

}
