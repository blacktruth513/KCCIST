package JAVA����._20200821.TEST02;
import java.util.Scanner;

/*
 * Chapter 05
 * ���� �帧�� ��Ʈ��
 * 104Page
 */
public class Test05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է� �� �ּ��� : ");
		int point = scan.nextInt();
		if (point >= 90 && point <= 100) {
			System.out.println(" A");
		} else if (point >= 80 && point < 90) {
			System.out.println(" B");
		} else if (point >= 70 && point < 80) {
			System.out.println(" C");
		} else if (point >= 60 && point < 70) {
			System.out.println(" D");
		} else if (point >= 101 || point <0) {
			System.out.println(" ������ �߸� �Է��ϼ˽��ϴ�.");
		} else {
			System.out.println(" F");
		}
		
		
		System.out.println("���ǿ����� ���");
		String grade;
		grade = (point >= 90 && point <= 100) ? "A":"";
		grade = (point >= 80 && point < 90) ? "B":"";
		grade = (point >= 70 && point < 80) ? "C":"";
		grade = (point >= 60 && point < 70) ? "D":"";
		grade = (point >= 101 || point < 60) ? "������ �߸� �Է��ϼ˽��ϴ�.":"";
		System.out.println(grade);
	}
}
