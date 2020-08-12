package com.dct.bankconcurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
	public static final int MAX_ACCOUNT = 10;
	public static final int MAX_AMOUNT = 10;
	public static final int INITIAL_BALANCE = 100;
	
	private Account[] accounts=new Account[MAX_ACCOUNT];
	
	private Lock bankLock;
	
	public Bank() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(INITIAL_BALANCE);
		}
		bankLock=new ReentrantLock();
	}
	
	public void transfer(int from,int to,int amount) {
		bankLock.lock();
		try {
		if(amount <= accounts[from].getBalance()) {
			accounts[from].withdraw(amount);
			accounts[to].deposit(amount);
			
			String message = "%s transfered %d from %s to %s. Total balance: %d\n";
			String threadName=Thread.currentThread().getName();
			System.out.printf(message, threadName,amount,from,to,getTotalBalance());
		}
		}
		finally {
			bankLock.unlock();	
		}
		
	}
	
	public int getTotalBalance() {
		bankLock.lock();
		try {

			return Arrays.asList(accounts)
					     .stream()
			             .mapToInt(ob -> ob.getBalance())
			            // .sum();
			             .reduce(0, Integer::sum);
		}
		finally {
			bankLock.unlock();
		}
		
		
	}
	
	
}
