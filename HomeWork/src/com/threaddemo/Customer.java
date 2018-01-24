package com.threaddemo;

public class Customer {
	int balance;
	String name;
	
	public Customer() {
		this.balance=0;
		this.name=null;
	}
	
	public Customer(int balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [balance=" + balance + ", name=" + name + "]";
	}
	
	
}
