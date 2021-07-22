package JAVA����._20200824.TEST03;

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
public class AccountManager {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();

		System.out.print("����� ������ �Է����ּ���. : ");
		String entername = scan.nextLine();
		bankAccount.name = entername;
		
		while (true) {

			System.out.println("###########���� ����############\n# 1. �Ա� \n# 2. ���\n# 3. �ܾ� Ȯ��\n# 4. ����\n###############################");
			
			System.out.print("�޴� �׸��� �������ּ���. : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.print("�Ա��� �ݾ��� �Է����ּ���. : ");
				int deposit = scan.nextInt();
				bankAccount.deposit(deposit);
			}else if(choice == 2) {
				System.out.print("����� �ݾ��� �Է����ּ���. : ");
				int amount = scan.nextInt();
				bankAccount.withdraw(amount);
			}else if(choice == 3) {
				System.out.println("�ܾ� : "+bankAccount.balance);
				bankAccount.checkMyBalance();
//				System.out.println("�ܾ���"+bankAccount.checkMyBalance()+"�� �Դϴ�.");
			}else if(choice == 4) {
				break;
			}//end of if
		}//end of while
	
	}//end of method
	
}//end of class