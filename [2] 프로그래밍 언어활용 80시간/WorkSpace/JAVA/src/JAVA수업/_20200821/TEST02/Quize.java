package JAVA����._20200821.TEST02;

import java.util.Scanner;

public class Quize {
	/*
	1. ����ڰ� �Է��� �������� ����Ͻÿ�.
	��°�� 
	���ϴ� �����ܼ��� �Է��Ͻÿ�. : 2
	
	2 x 1 = 2
	2 x 2 = 4
	..
	 */
	
	public static void manual() {
		System.out.println("****************************  �� ������ ���ѷ���  *******************************");
		System.out.println("=================================================================================");
		System.out.println("\n\twhile(true) {\n\t	System.out.println(\"test\");\n\t}\n\n\tfor (;;) {\n\t	System.out.println(\"test\");\n\t}\n\n");
		System.out.println("=================================================================================");
	}
	public static void quize1() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. ����ڰ� �Է��� �������� ����Ͻÿ�.");
		System.out.print("���ϴ� �����ܼ��� �Է��Ͻÿ�. :");
		int dan = scan.nextInt();
		
		for (int j = 1; j <10; j++) {
			System.out.println(" " + dan + " X " + j + " = " + (dan * j));
		}
		
		System.out.println("\n\n");
	}// The end of method quize1
	
	public static void quize2() {
		System.out.println("2. ������ ����� ����Ͻÿ�.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j<=i) {
					System.out.print("*");
//					System.out.print(" ["+i+"]["+j+"]  ");
//					System.out.print(" ["+i+"]["+j+"]  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
//					System.out.print("*");
					System.out.print(" ["+i+"]["+j+"]  ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}// The end of method quize2
	
	
	public static void quize3() {
		System.out.println("3. ������ ����� ����Ͻÿ�.");
		System.out.println("���ǹ� ���");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j+i<=10) {
//					System.out.print("*");
//					System.out.print(" ["+i+"]["+j+"]  ");
//					System.out.print(" ["+j+"]  ");
					System.out.print(" "+ j+" " );
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("for�� ������� 1");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10-i; j++) {

				System.out.print(" "+ j+" " );
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("for�� ������� 2");
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print(" "+ j+" " );
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n");
	}// The end of method quize3
}
