package JAVA����._20200821.TEST02;
import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * Page : 111
 */
public class Test06 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ� : ");
		
		int age = scan.nextInt();
		
		String msg = (age > 18) ? "����":"�̼�����";
		System.out.println(msg);
	}
}
