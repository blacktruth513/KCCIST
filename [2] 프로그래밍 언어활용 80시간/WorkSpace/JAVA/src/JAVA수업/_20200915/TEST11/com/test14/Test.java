package JAVA����._20200915.TEST11.com.test14;

/*
 * 20-1	���� Ŭ����
 * PAGE : 442
 */

public class Test {
	public static void main(String[] args) {
		
		int a= 1;
		//Boxing : ���� �ν��Ͻ��� ���δ� ����
		//�ν��Ͻ��� ������ ���� �̷������.
		Integer a2 = new Integer(10);	
		
		System.out.println(a+" + "+a2 + " = " + (a + a2));
		
		//Unboxing : ����� ���� ������ ����
		//����Ŭ������ ���ǵ� �޼ҵ��� ȣ���� ���� �̷������.
		int a3 = a2.intValue(); 
		
		//Auto Boxing
		Integer a4 = 12; 
		
		Integer a5 = new Integer(20);

		//Auto Unboxing
		int a6 = a5;
		
		Integer b1 = new Integer(10);
		Integer b2 = new Integer(20);
		Integer c1 =  b1 + b2;
		System.out.println(c1);
		
		
	}//The end of main Method
}//The end of class
