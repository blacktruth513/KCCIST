package JAVA����._20200821.TEST02;
import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * 104Page
 */
public class Test04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = scan.nextInt();
		
		if (age > 18) {
			System.out.println("����� �����Դϴ�.");
		}else {
			System.out.println("����� �̼������Դϴ�.");
		}
		System.out.println("����� ���̴� : "+age+"�Դϴ�.");
		
		System.out.print("�޴��� ���� �� �ּ���\n1.«��, 2.¥���, 3.������\n���� : ");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("«���� �����ϼ˽��ϴ�.");
		} else if (choice == 2) {
			System.out.println("¥����� �����ϼ˽��ϴ�.");
		} else if (choice == 3) {
			System.out.println("�������� �����ϼ˽��ϴ�.");
		} else {
			System.out.println("�߸� ���˽��ϴ�.");
		}
		
	}
}
