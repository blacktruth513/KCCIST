package test2;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
//		int choice = 1;
//		if (choice == 1) {
//			System.out.println("«��");
//
//		}
//		if (choice == 2) {
//			System.out.println("�����");
//
//		}
//		if (choice == 3) {
//			System.out.println("������");
//		}
//
//		if (choice == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�޴��� �������ּ���. : ");
int choice = sc.nextInt();
if(choice == 1) {
	System.out.println("«���Դϴ�.");
		} else if (choice == 2) {
System.out.println("������Դϴ�.");
		} else if (choice == 3) {
			System.out.println("�������Դϴ�.");
		} else {
			System.out.println("������ �ٽ� Ȯ�����ּ���.");
		}
	}
}
