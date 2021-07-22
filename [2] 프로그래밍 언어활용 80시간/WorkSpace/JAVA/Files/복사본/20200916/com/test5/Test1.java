package com.test5;
interface Account<T>{
	T getBalance();
	void deposit(T amount);
	void withdraw(T amount);
}
class BankAccount<T> implements Account<T>{
	T balance;
	@Override
	public T getBalance() {
		return null;
	}
	@Override
	public void deposit(T amount) {
		
	}
	@Override
	public void withdraw(T amount) {
	}
	
	
}

public class Test1 {
	public static void main(String[] args) {
	}
}
