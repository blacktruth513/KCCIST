package JAVA����._20200821.TEST02;
import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 117
 */
public class Test08 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("���̸� �Է� �� �ּ��� : ");
		int world1 = scan.nextInt();
		
		System.out.println();
		
		System.out.print("�̸��� �Է� �� �ּ��� : ");
		String world2 = scan.next();
		
		System.out.println("���� : "+world1 + " �̸� : "+world2);
	}
}
