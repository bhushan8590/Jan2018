package com.collectiondemos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.carsearch.Car;

public class TestComparable {

	public static void main(String[] args) {
		CarComparable car = new CarComparable("Toyota", "2018", "White", 800000);
		CarComparable car1 = new CarComparable("Toyota", "2018", "Red", 600000);
		CarComparable car2 = new CarComparable("Toyota", "2018", "Yellow", 900000);
		CarComparable car3 = new CarComparable("Toyota", "2018", "Black", 700000);
		CarComparable[] cars = new CarComparable[4];
		cars[0]=car;
		cars[1]=car1;
		cars[2]=car2;
		cars[3]=car3;
		List<CarComparable> carList = new ArrayList<CarComparable>();
		carList.add(car);
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		System.out.println("Sort using Collections.sort");
		Collections.sort(carList);
		for (CarComparable carComparable : carList) {
			System.out.println(carComparable.toString());
		}
		/*System.out.println("Sort using Arrays.sort");
		 *Arrays.sort(cars);
		for (CarComparable carComparable : cars) {
			System.out.println(carComparable.toString());
		}
		System.out.println("---------------");
		System.out.println("Sort using Comparator");
		Arrays.sort(cars,new ColorComparator());
		for (CarComparable carComparable : cars) {
			System.out.println(carComparable.toString());
		}*/

	}

}
