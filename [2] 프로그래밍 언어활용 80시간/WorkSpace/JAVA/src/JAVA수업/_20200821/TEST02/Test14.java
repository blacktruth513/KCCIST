package JAVA����._20200821.TEST02;

import java.util.Scanner;
/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 119
 */
public class Test14 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Quize quize = new Quize();

		quize.manual();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Quize 1~3�� ���� : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
//				Quize.quize1();
				quize.quize1();
			}else if(choice == 2) {
//				Quize.quize2();
				quize.quize2();
			}else if(choice ==3) {
//				Quize.quize3();
				quize.quize3();
			}else {
				break;
			}
		}// the end of while
		
		System.out.println("��� ����Ǿ����ϴ�.");
		
	}// the end of main
}// the end of class