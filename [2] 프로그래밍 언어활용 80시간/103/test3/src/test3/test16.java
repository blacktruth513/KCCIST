package test3;

public class test16 {

	public static void main(String[] args) {
System.out.println("###########계좌관리############");
System.out.println("# 1. 입금");
System.out.println("# 2. 출금");
System.out.println("# 3. 잔액 확인");
System.out.println("# 4. 종료");
System.out.println("#############################");
System.out.println("# 메뉴 항목을 선택해 주세요. : ");
System.out.println("입금할 금액을 입력해주세요. : ");
	}
}

class BankAccountOO {
	public static void main(String[] args) {
		BankAccount i1 = new BankAccount();
		BankAccount c1 = new BankAccount();
		i1.deposit();
		c1.deposit();
		i1.withdraw();
		c1.withdraw();
		i1.checkMyBalance();
		c1.checkMyBalance();
	}


public int deposit(int amount) {
	balance += amount;
	return balance;
}
public int withdraw(int amount) {
	balance -= amount;
	return balance;
}
public int checkMyBalance() {
	System.out.println(" " + balance)
return balance;
}

	}
