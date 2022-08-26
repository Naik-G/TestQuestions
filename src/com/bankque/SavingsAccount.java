package com.bankque;

public class SavingsAccount {
	 float balance;
	 float interest;

		public SavingsAccount(float balance, float interest) {
			this.balance = balance;
			this.interest = interest;
		}

		public String withdraw(float amount) {

			if (this.balance > amount) {
				this.balance -= amount;
				return "Withdraw Successful of rs." + amount;
			} else {
				return "Insufficient Fund";
			}
		}

		
		public String deposit(float amount) {
			if ( amount > 0) {
				this.balance += amount;
				return "deposit successful of rs." + amount;
			} else {
				return "please insert valid amount";
			}
		}
		
		public String showBalance() {
			return "Available Funds: "+this.balance;
		}
}
