package JAVA����._20200915.TEST12.com.test02;

public class Test01 {
	static void add(int a, int b) {
		
	}
	static void add(String a, String b) {
		
	}
	
	//��� Ÿ���� ���� �� ����
	static void add2(Object a, Object b) {
		
	}
	
	//��� Ÿ���� ���� �� ����
	static void test1(Object b) {
		Integer i = (Integer)b;
	}
	//int���� ���� �� ����
	static void test2(int b) {
		
	}
	
	
	public static void main(String[] args) {
		add2("test", "test2");
		add2(10, 10);
		Object o = 100;
		Integer o2 = 100;
		int o3 = o2;
		
		//Reference type
		String str = "�̼���";	
		
		//Value type
		int a = 100;			
		
		//Object���� Integer�� Casting�ϸ� value type�� ����� �� ����
		//��, ���� �̾Ƴ��� ���� unboxing �ʿ�
		Object oo1 = new Integer(100);
		
		//boxing
		Object oo2 = 100;
		int oo3 = (Integer)oo2;
		
		
	}
}
