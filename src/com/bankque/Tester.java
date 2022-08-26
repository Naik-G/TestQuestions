package com.bankque;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount account= new SavingsAccount(1000,2);
		System.out.println(account.withdraw(200));
		System.out.println(account.deposit(100));
		System.out.println(account.showBalance());
	}

}
