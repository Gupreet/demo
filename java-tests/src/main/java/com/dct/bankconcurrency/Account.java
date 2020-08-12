package com.dct.bankconcurrency;

public class Account {
	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		this.balance -=amount;
	}
	
	public void deposit(int amount) {
		this.balance+=amount;
	}
	
	public int getBalance() {
		return this.balance;
	}

}
