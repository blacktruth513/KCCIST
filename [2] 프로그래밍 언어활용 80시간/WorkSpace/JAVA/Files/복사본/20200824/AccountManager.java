import java.util.Scanner;

public class AccountManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount acc = new BankAccount();
		while(true) {
			System.out.println("###########계좌 관리############");
			System.out.println("# 1. 입금 ");
			System.out.println("# 2. 출금 ");
			System.out.println("# 3. 잔액 확인");
			System.out.println("# 4. 종료 ");
			System.out.println("##############################");
			System.out.print("# 메뉴 항목을 선택해주세요. : ");
			int sel = sc.nextInt();
			if (sel == 1) {			
				System.out.print("입금할 금액을 입력해주세요. : ");
				int price = sc.nextInt();
				acc.deposit(price);				
			} else if(sel == 2) {
				System.out.print("출금할 금액을 입력해주세요. : ");
				int price = sc.nextInt();
				acc.withdraw(price);
			} else if(sel == 3) {
				int price = acc.checkBalance();
				System.out.println("잔액은 " + price + "원 입니다.");
			} else if(sel == 4) {
				System.out.println("감사합니다. 안녕히 가십시요.");
				break;
			} else {
				System.out.println("잘못선택하셨습니다. 다시 선택해주세요.");
			}
		}
	}
}
