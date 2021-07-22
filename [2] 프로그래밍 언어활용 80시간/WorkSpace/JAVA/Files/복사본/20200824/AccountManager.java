import java.util.Scanner;

public class AccountManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount acc = new BankAccount();
		while(true) {
			System.out.println("###########���� ����############");
			System.out.println("# 1. �Ա� ");
			System.out.println("# 2. ��� ");
			System.out.println("# 3. �ܾ� Ȯ��");
			System.out.println("# 4. ���� ");
			System.out.println("##############################");
			System.out.print("# �޴� �׸��� �������ּ���. : ");
			int sel = sc.nextInt();
			if (sel == 1) {			
				System.out.print("�Ա��� �ݾ��� �Է����ּ���. : ");
				int price = sc.nextInt();
				acc.deposit(price);				
			} else if(sel == 2) {
				System.out.print("����� �ݾ��� �Է����ּ���. : ");
				int price = sc.nextInt();
				acc.withdraw(price);
			} else if(sel == 3) {
				int price = acc.checkBalance();
				System.out.println("�ܾ��� " + price + "�� �Դϴ�.");
			} else if(sel == 4) {
				System.out.println("�����մϴ�. �ȳ��� ���ʽÿ�.");
				break;
			} else {
				System.out.println("�߸������ϼ̽��ϴ�. �ٽ� �������ּ���.");
			}
		}
	}
}
