package test2;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�޴��� �Է����ּ���. :");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("«��");
			} else {
				break;
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}
}
