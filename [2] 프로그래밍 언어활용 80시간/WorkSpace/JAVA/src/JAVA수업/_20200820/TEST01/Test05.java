package JAVA����._20200820.TEST01;

import javax.swing.border.EmptyBorder;

public class Test05 {
	public static void main(String[] args) {
		int a = 0;
		System.out.println(a);
//		int b = a++; 
//		System.out.println(b);//a�� ȣ������ �� ����
		System.out.println(a);//a�� ȣ������ �� ����
		a++;
		System.out.println(a);//a�� ȣ������ �� ����
		int b = 0;
		++b;
		System.out.println(b);
		++b;
		System.out.println(b);
		b--;
		System.out.println(b);
		b--;
		System.out.println(b);
		int a1 = 0;
		System.out.println(a1);
		int b1 = a1++;
		System.out.println(b1);
		System.out.println(a1);
		System.out.println("==========");
		int a2 = 0;
		System.out.println(a2);
		int b2 = ++a2;
		System.out.println(b2);
		System.out.println(a2);
	}
}
