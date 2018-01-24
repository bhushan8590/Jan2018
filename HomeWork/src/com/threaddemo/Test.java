package com.threaddemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<Customer> custList = new ArrayList<Customer>();
		int choice;
		// ExecuteTransaction et = new ExecuteTransaction();
		int processAmt = 0;
		for (int i = 0; i <= 10; i++) {
			Customer c = new Customer(1000 + i, "c" + i);
			custList.add(c);
		}
		/*System.out.println("Time before loop:" + System.currentTimeMillis());
		for (Customer customer : custList) {
			processAmt += 10;
			// et.processPayment(customer, processAmt);
			ExecuteTransaction et = new ExecuteTransaction();
			et.setCustomer(customer, processAmt);
			et.start();
		}
		System.out.println("Time After loop:" + System.currentTimeMillis());*/
		do {
			System.out.println("Choose option");
			System.out.println("1.Without Thread");
			System.out.println("2.With Thread");
			System.out.println("3.With Thread and Synchronized");
			System.out.println("4.Quit");
			System.out.print("Enter your choice(1-4):");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:	System.out.println("Time before loop:" + System.currentTimeMillis());
					ExecuteTransaction et = new ExecuteTransaction();
					for (Customer customer : custList) {
						processAmt += 10;
						//et.processPayment(customer, processAmt);
						et.processTransaction(customer, processAmt);
					}
					System.out.println("Time After loop:" + System.currentTimeMillis());
				break;
				
			case 2: for(Customer customer : custList) {
						processAmt += 10;
						ExecuteTransaction et1 = new ExecuteTransaction();
						et1.setCustomer(customer, processAmt);
						et1.flag = true;
						et1.start();
					}
				break;
				
			case 3:for(Customer customer : custList) {
						processAmt += 10;
						ExecuteTransaction et2 = new ExecuteTransaction();
						et2.setCustomer(customer, processAmt);
						et2.start();
					}
				break;
			}
		} while (choice != 4);
		System.out.println("Thank You...!!");
	}

}
