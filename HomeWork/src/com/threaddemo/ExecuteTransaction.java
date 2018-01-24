package com.threaddemo;

public class ExecuteTransaction extends Thread {
	
	Customer c = new Customer();
	int processAmt;
	boolean flag=false;
	
	public void setCustomer(Customer cust, int amt) {
		
		this.c.setBalance(cust.balance);
		this.c.setName(cust.name);
		this.processAmt = amt;
	}
	
	public synchronized static void processPayment(Customer cust, int amt) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cust.setBalance(cust.getBalance() - amt);	
		System.out.println(cust.toString());
	}
	
	public void processTransaction(Customer cust, int amt){
		cust.setBalance(cust.getBalance() - amt);
		System.out.println(cust.toString());
	}
	public void run() {
		if(flag == true){
			processTransaction(c, processAmt);
		}
		else{
			processPayment(this.c, this.processAmt);
		}
		
	}

}
