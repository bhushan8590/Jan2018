package com.callableandfuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Customer> custList = new ArrayList<Customer>();
		List<Future<Customer>>futureList = new ArrayList<Future<Customer>>();
		List<Future<Customer>>failFutureList = new ArrayList<Future<Customer>>();
		int processAmt = 10;
		Customer c1 = new Customer();
		for (int i = 0; i <= 10; i++) {
			Customer c = new Customer(1000, "c" + i);
			custList.add(c);
		}
		ExecutorService paymentService = Executors.newCachedThreadPool();
		for(Customer customer : custList) {
			//processAmt += 10;
			ExecuteTransaction et1 = new ExecuteTransaction();
			if(customer.getName().equals("c5")){
				et1.setCustomer(customer, processAmt+1000);
				futureList.add(paymentService.submit(et1));
			}
			else{
			et1.setCustomer(customer, processAmt);
			futureList.add(paymentService.submit(et1));
			}
			//paymentService.submit(et1);
		}
		
		for (Future<Customer> future : futureList) {
			
			c1 = future.get();
			
			if(c1.transactionFlag){
				ExecuteTransaction et1 = new ExecuteTransaction();
				//c1.setName("c5_to_cc5");
				c1.setBalance(2000);
				et1.setCustomer(c1, processAmt);
				failFutureList.add(paymentService.submit(et1));
			}
			System.out.println(c1.toString());
		}
		for (Future<Customer> future : failFutureList) {
			System.out.println("new started thread:"+future.get().toString());
		}
		// before calling shutdown check using await shutdown method
		paymentService.shutdown();
	}

}
