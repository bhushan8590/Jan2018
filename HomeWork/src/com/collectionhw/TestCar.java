package com.collectionhw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCar {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		Map<Integer, Car> carMap = new HashMap<Integer, Car>();
		int i;
		for(i=0; i<=1000000; i++){
			Car c = new Car(2010+i, 1+i, "make"+i, "model"+i);
			carList.add(c);
			carMap.put(c.getVinNo(), c);
		}
		System.out.println("Time before call:"+System.currentTimeMillis()+" milisecond");
		TestCar.searchInList(carList, 999999);
		System.out.println("Time before call:"+System.currentTimeMillis()+" milisecond");
		TestCar.searchInMap(carMap, 999999);
	}
	
	private static void searchInList(List<Car> carList, int no) {
		for (Car car : carList) {
			if(car.getVinNo() == no){
				System.out.println("Record found in List:"+System.currentTimeMillis()+" milisecond");
			}
		}

	}
	
	private static void searchInMap(Map<Integer, Car> carMap, int no) {
		if(carMap.get(no) != null){
			System.out.println("Record found in Map:"+System.currentTimeMillis()+" milisecond");
		}

	}
}
