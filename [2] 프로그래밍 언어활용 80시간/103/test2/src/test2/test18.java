package test2;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("######################");
			System.out.println("#1. ������ ��� ");
			System.out.println("#2. ����");
			System.out.print("�����ܼ��� �Է����ּ���. :");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("�ܼ��� �Է����ּ���. : ");
				int num2 = sc.nextInt();
				 for (int i = 1; i < 10; i++) {
				 System.out.println(num2 + "x" + i + "=" + (num2 * i));
			
				}
			}else if(num ==2) {
				System.out.println("����Ǿ����ϴ�.");
				 break;
			}
		}
	}
}
