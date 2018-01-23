package com.carsearch;

import java.util.Scanner;

public class TestCar {
	
	private void searchCars(Car[] cars,String str) {
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].make == str || cars[i].model == str || cars[i].year == str || cars[i].color == str){
				System.out.println(cars[i]);
			}
		}
		
	}

	/*private void searchCarsele(Car[] cars, String ...strings) {
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].make == str || cars[i].model == str || cars[i].year == str || cars[i].color == str){
				System.out.println(cars[i]);
			}
		}	
	}*/

	public static void main(String[] args) {
		Car car = new Car("Toyota","Camery","2018","Black");
		Car car1 = new Car("Honda","Civic","2019","Red");
		Car car2 = new Car("Hyundai","Sonata","2018","White");
		Car car3 = new Car("Lexus","GSF","2018","Grey");
		Car car4 = new Car("Toyota","Corola","2019","Red");
		Car car5 = new Car("Honda","Accord","2019","Black");
		Car[] cars = new Car[6];
		cars[0] = car;
		cars[1] = car1;
		cars[2] = car2;
		cars[3] = car3;
		cars[4] = car4;
		cars[5] = car5;
		/*Scanner sc = new Scanner(System.in);
		String searchStr;
		System.out.println("Enter search value:");
		searchStr = sc.nextLine();*/
		new TestCar().searchCars(cars, "Grey");
	}
}
