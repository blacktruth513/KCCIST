package JAVA����._20200824.TEST03.Chapter6_Quize;

import java.util.Scanner;

public class Chapter06_1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Quize qzuize = new Quize();
		int choice = 0;
		
		while (true) {
			System.out.print("���� ���� ����� 1���� �����ּ��� :");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("value1�� �Է� :");
				int value1 = scan.nextInt();
				System.out.print("value2�� �Է� :");
				int value2 = scan.nextInt();
				
				qzuize.quize1(value1, value2);
				qzuize.quize2(value1, value2);
			}else {
				break;
			}//end of if
			
		}//end of while
		
	}//end of main Method

}//The end of Class