package JAVA����._20200821.TEST02;

import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 119
 */
public class Test11 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("while���� �̿��� ��������");
		
		while (true) { //������ true�� �� ���� ���ѹݺ�
			System.out.print("Please choise the menu : ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("«��");
			} else {
				break;
			}// the end of if
		}// the end of while
		System.out.println("����Ǿ����ϴ�.");
	}//the end of main
}//the end of class
