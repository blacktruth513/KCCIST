package JAVA����._20200821.TEST02;
import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 118
 */
public class Test09 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����ġ������ ������ ������ �Է¹ޱ�");
		System.out.print("0~100 �̳��� �ڿ����� �Է��Ͻÿ� : ");
		
		int n = scan.nextInt();
		
		switch (n/10) {
		case 0:
			System.out.println("0�̻� 10 �̸� �μ�");
			System.out.println("���� : 0 = "+n/10);
			break;
		case 1:
			System.out.println("10�̻� 20 �̸� �μ�");
			System.out.println("���� : 1 = "+n/10);
			break;
		case 2:
			System.out.println("20�̻� 30 �̸� �μ�");
			System.out.println("���� : 2 = "+n/10);
			break;
		case 3:
			System.out.println("30�̻� 40 �̸� �μ�");
			System.out.println("���� : 3 = "+n/10);
			break;
		case 4:
			System.out.println("40�̻� 50 �̸� �μ�");
			System.out.println("���� : 4 = "+n/10);
			break;

		default:
			System.out.println("50�̻��� �ڿ���");
			System.out.println(n/10);
			break;
		}
	}
}
