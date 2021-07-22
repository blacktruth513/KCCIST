public class Test11 {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.checkBalance();		
		acc.deposit(10000);
		acc.checkBalance();
		acc.withdraw(5000);
		acc.checkBalance();
		
	}
}
