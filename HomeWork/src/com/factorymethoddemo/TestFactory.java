package com.factorymethoddemo;

public class TestFactory {

	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		Car c = cf.getCar("nissan");	
		Car c1 = cf.getCar("honda");
		Car c2 = cf.getCar("toyota");
		c.drive();
		c1.drive();
		c2.drive();

	}

}
