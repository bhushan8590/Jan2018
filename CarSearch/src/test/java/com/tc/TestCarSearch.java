package com.tc;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class TestCarSearch extends TestCase {
	
	public void testSearchCar() {
		List<Car> clist = new ArrayList<Car>();
		int vin = 1;
		Car c = new Car(vin, 80000, "Honda", "accord");
		clist.add(c);
		assertEquals(c.toString(), c.toString());
	}
	
	public void testSearchArray(){
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		assertEquals(20, new CarSearchClass().arraySearch(arr,20));
	}
}
