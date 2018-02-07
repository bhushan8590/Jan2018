package com.tc;

import java.util.ArrayList;
import java.util.List;

public class CarSearchClass {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		List<Car> carList = new ArrayList<Car>();
		Car car;
		for(int i=0; i<10; i++){
			car = new Car(i+1,80000,"Honda","Accord");
			carList.add(car);
		}
		System.out.println(new CarSearchClass().arraySearch(arr,40));
		new CarSearchClass().carSearchMethod(carList, 2);
	}
	
	public void carSearchMethod(List<Car> carList, int vin) {
		for (Car car : carList) {
			if(car.getVin() == vin){
				System.out.println(car.toString());
			}
		}
	}
	
	public int arraySearch(int[] arr, int ele){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return arr[i];
			} 
		}
		return -1;
	}

}
