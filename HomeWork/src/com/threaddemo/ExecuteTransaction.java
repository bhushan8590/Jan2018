package com.threaddemo;

public class ExecuteTransaction extends Thread {
	
	Customer c = new Customer();
	int processAmt;
	//boolean flag=false;
	
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
	
	public void processTransaction(Customer cust, int amt) throws Exception{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(cust.name.equals("c5")){
			cust.flag=true;
			throw new Exception("Transaction Fail");
		}
		cust.setBalance(cust.getBalance() - amt);
		System.out.println(cust.toString());
	}
	public void run() {
		/*if(flag == true){
			try {
				processTransaction(c, processAmt);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else{
			processPayment(this.c, this.processAmt);
		}*/
		try {
			processTransaction(c, processAmt);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());			
		}
		
	}

}
