package JAVA����._20200916.TEST13.com.test05;

/*
�Ϲ�ȭ �ϱ�
interface IAccount {
	int getBalance();
	void deposit(int amount);
	void withdraw(int amount);
}

class BankAccount implements IAccount {}
*/

interface IAccount<T > {
	T getBalance();
	void deposit(T amount);
	void withdraw(T amount);
}

class BankAccount<T> implements IAccount<T> {

	@Override
	public T getBalance() {
		return null;
	}

	@Override
	public void deposit(T amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(T amount) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Test01 {

}
