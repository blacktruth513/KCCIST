public class BankAccount {
	int balance = 0;
	public int deposit(int amount) {
		balance += amount; // balance = balance + amount
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkBalance() {
		System.out.println("ภÜพื : " + balance);
		return balance;
	}
}
