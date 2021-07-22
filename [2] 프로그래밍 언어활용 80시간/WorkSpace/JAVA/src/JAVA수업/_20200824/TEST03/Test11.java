package JAVA����._20200824.TEST03;

import java.util.InputMismatchException;
import java.util.Scanner;

import JAVA����._20200824.TEST03.Chapter7.BankAccount;
import JAVA����._20200824.TEST03.Chapter7.BankAccountOO;

/*
 *	Chapter 07
 *	07-1 Ŭ������ ���ǿ� �ν��Ͻ��� ����
 *	Page : 165
 *
 *	Ŭ������ ������ �޼ҵ带 �Բ� ��� �����Ѵ�.
 */

@SuppressWarnings("unused")
public class Test11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();

		System.out.print("����� ������ �Է����ּ���. : ");
		String entername = scan.nextLine();
		bankAccount.name = entername;

		try {
			while (true) {

				System.out.println(
						"###########���� ����############\n# 1. �Ա� \n# 2. ���\n# 3. �ܾ� Ȯ��\n# 4. ����\n###############################");
				System.out.print("�޴� �׸��� �������ּ���. : ");
				int choice = scan.nextInt();

				if (choice == 1) {
					System.out.print("�Ա��� �ݾ��� �Է����ּ���. : ");
					int deposit = scan.nextInt();
					bankAccount.deposit(deposit);

				} else if (choice == 2) {
					System.out.print("����� �ݾ��� �Է����ּ���. : ");
					int amount = scan.nextInt();
					bankAccount.withdraw(amount);
				} else if (choice == 3) {
					System.out.println("�ܾ� : " + bankAccount.balance);
					bankAccount.checkMyBalance();
					// System.out.println("�ܾ���"+bankAccount.checkMyBalance()+"�� �Դϴ�.");
				} else if (choice == 4) {
					System.out.println("�����մϴ�. �ȳ��� ���ʽÿ�.");
					break;
				} else {
					System.out.println("�߸������ϼ̽��ϴ�. �ٽ� �������ּ���.");
				} // end of if
			} // end of while
		} catch (ArithmeticException | InputMismatchException e) {

			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �������ּ���.");
			System.out.println("Ÿ�� �̽���ġ �߻� : " + e.getMessage());
			// TODO: handle exception
		}

	}// end of method

}// end of class