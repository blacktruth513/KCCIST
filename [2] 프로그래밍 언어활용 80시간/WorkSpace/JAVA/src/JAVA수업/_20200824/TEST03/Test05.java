package JAVA����._20200824.TEST03;

import java.util.Scanner;

/*
 *	Chapter11
 *	06-1 �޼ҵ忡 ���� ���ؿ� �޼ҵ��� ����
 *	Page : 241
 *
 *	Ŭ������ ������ �޼ҵ带 �Բ� ��� �����Ѵ�.
 */
//Ŭ���� ������ public�� ���� Ŭ������ �������� ������ �����ؾ��Ѵ�.
@SuppressWarnings("unused")
public class Test05 {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 4));
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static String add1(int a, int b) {
		return "�Ű������� ���� ��ȯŸ���� �ٸ� ��� \n �����ε��� �������� �ʴ´�.";
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
}//end of class

