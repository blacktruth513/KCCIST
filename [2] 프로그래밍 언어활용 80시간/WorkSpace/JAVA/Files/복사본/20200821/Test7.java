import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �������ּ���. : ");
		int menu = sc.nextInt();
		switch(menu) {
			case 1:
				System.out.println("«��");
				break;
			case 2:
				System.out.println("�����");
				break;
			case 3:
				System.out.println("������");
				break;
			default:
				System.out.println("�߸��� �޴��Դϴ�.");
		}
		System.out.println("����");

	}

}
