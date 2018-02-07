package com.callableandfuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class ExecuteTransaction implements Callable<Customer> {
	
	Customer customer = new Customer();
	int processAmt;
	
	public void setCustomer(Customer cust, int amt) {
		
		this.customer.setBalance(cust.getBalance());
		this.customer.setName(cust.getName());
		this.processAmt = amt;
	}
	
	public void processTransaction(Customer cust, int amt) throws Exception{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(cust.getBalance() < amt){
			cust.transactionFlag=true;
			throw new Exception(""+cust.getName()+" Transaction Fail bcoz Bal:"+cust.getBalance()+" & process amt:"+amt);
		}else{
		cust.setBalance(cust.getBalance() - amt);
		}
		//System.out.println(cust.toString());
	}

	@Override
	public Customer call() throws Exception {
		try {
			processTransaction(customer, processAmt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return this.customer;
	}

}
