package JAVA����._20200820.HelloWorld2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(7);
		System.out.println(3.15);

		// ���ڿ� + ������ = ������ 
		System.out.println("3 + 5 = " + 8);
		System.out.println(3.15 + "�� �Ǽ��Դϴ�.");
		System.out.println("3 + 5" +" �� ���� ����� 8�Դϴ�."+ 8);
		System.out.println(3 + 5);
		
		math(3, 5);
	
	}
	
	public static void math(int a, int b) {
		System.out.println(a + " + " + b + " = "+ (a+b));
		System.out.println(a + " - " + b + " = "+ (a-b));
		System.out.println(a + " * " + b + " = "+ (a*b));
		System.out.println(a + " / " + b + " = "+ (a/b));
	}

}
