package JAVA����._20200821.TEST02;
import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 117
 */
public class Test07 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("�޴��� ���� �� �ּ���\n1.«��, 2.¥���, 3.������\n���� : ");
		int choice = scan.nextInt();
		/*
		if (choice == 1) {
			System.out.println("«���� �����ϼ˽��ϴ�.");
		} else if (choice == 2) {
			System.out.println("¥����� �����ϼ˽��ϴ�.");
		} else if (choice == 3) {
			System.out.println("�������� �����ϼ˽��ϴ�.");
		} else {
			System.out.println("�߸� ���˽��ϴ�.");
		}
		 */
		
		switch (choice) {
		case 1: System.out.println("«���� �����ϼ˽��ϴ�.");
			break;
		case 2: System.out.println("¥����� �����ϼ˽��ϴ�.");
			break;
		case 3: System.out.println("�������� �����ϼ˽��ϴ�.");
			break;

		default: System.out.println("�߸� ���˽��ϴ�.");
			break;
		}
	}
}
