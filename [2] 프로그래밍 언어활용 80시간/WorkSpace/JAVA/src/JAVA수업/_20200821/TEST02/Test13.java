package JAVA����._20200821.TEST02;

import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 119
 */
public class Test13 {
	public static void main(String[] args) {
		
		Gugudan.gugudanStart();

	}// the end of main
}// the end of class



























class Gugudan {
	
	public Gugudan() {
	}
	
	public static void gugudanStart() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("�������� ����Ͻÿ�.");
		while(true) {
			System.out.print("������ ������ �����Ͻÿ� [1.���� ���, 2.�������, ����� �ٸ���ȣ �Է�] :");
			int choice = scan.nextInt();
			if (choice == 1) {
				Gugudan.gugudan1();
			}else if(choice == 2) {
				Gugudan.gugudan2();
			}else {
				break;
			}
		}
	}
	public static void gugudan1() {
		System.out.println("[�������]");
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n ** " + i + "�� **");
			for (int j = 1; j <= 9; j++) {
				System.out.println(" " + i + " X " + j + " = " + (i * j));
			}
		}
	}
	
	public static void gugudan2() {
		System.out.println("[���� ���]");
		
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(" " + i + " X " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("2�������� ��ġ�� �޶����ٸ�");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(" " + i + " X " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}