package JAVA����._20200824.TEST03.Chapter7;
//162 page
public class BankAccountOO {
	public static void main(String[] args) {
		
		//Instance �ΰ� ����
		BankAccount yoon = new BankAccount("yoon");
		BankAccount park = new BankAccount("park");
		
		//�� �ν��Ͻ��� ������� ���� ����
		yoon.deposit(5000);
		park.deposit(5000);
		
		//�� �ν��Ͻ��� ������� ����� ����
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		//�� �ν��Ͻ��� ������� �ܾ��� ��ȸ
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}
}

