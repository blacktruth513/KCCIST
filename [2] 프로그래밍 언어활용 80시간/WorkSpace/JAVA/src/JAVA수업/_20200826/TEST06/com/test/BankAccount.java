package JAVA����._20200826.TEST06.com.test;
public class BankAccount {
	
	public String name = "";
	public int balance = 0;

	public BankAccount() {
		super();
	}

	public BankAccount(String name) {
		super();
		this.name = name;
	}
	
	//�Ա�
	public int deposit(int amount) {
		if (this.name == "" || this.name == null || this.name.equals(null) || this.name.equals("")) {
			System.out.println(amount+" �� �Ա� ��");
		}else {
			System.out.println(this.name+"���� �̸�����"+amount+" �� �Ա� ��");
		}
		balance += amount;
		return balance;
	}
	
	//���
	public int withdraw(int amount) {
		if (this.balance-amount <= 0) {
			System.out.println("��� �ܾ��� �����մϴ�!!");
		}else {
			if (this.name == "" || this.name == null || this.name.equals(null) || this.name.equals("")) {
				System.out.println(amount+" �� ��� ��");
			}else {
				System.out.println(this.name+"���� �̸�����"+amount+" �� ��� ��");
			}
			balance -= amount;
		}
		return balance;
	}
	
	//�ܾ���ȸ
	public int checkMyBalance() {
		
		if (this.name == "" || this.name == null || this.name.equals(null) || this.name.equals("")) {
			System.out.println("���� ���� �ܾ� : "+balance);
		}else {
			System.out.println(this.name+"���� ���� ���� �ܾ� : "+balance);
		}
		
		return balance;
	}
}