package test3;

public class test16 {

	public static void main(String[] args) {
System.out.println("###########���°���############");
System.out.println("# 1. �Ա�");
System.out.println("# 2. ���");
System.out.println("# 3. �ܾ� Ȯ��");
System.out.println("# 4. ����");
System.out.println("#############################");
System.out.println("# �޴� �׸��� ������ �ּ���. : ");
System.out.println("�Ա��� �ݾ��� �Է����ּ���. : ");
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
