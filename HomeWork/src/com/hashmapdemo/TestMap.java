package com.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer, Car> carMap = new HashMap<Integer, Car>();
		Car c;
		for(int i=1; i<=10; i++){
			c = new Car(2017+i,"Honda",i);
			carMap.put(c.id, c);			
		}
		c= new Car(2018, "Honda", 11);
		carMap.put(c.id, c);
		//checking two car obj(1 & 5) having diff. obj value
		System.out.println(carMap.get(1).equals(carMap.get(5)));
		//checking two car obj(1 & 11) having same obj value
		System.out.println(carMap.get(1).equals(carMap.get(11)));
		System.out.println("car 1 hashcode:"+carMap.get(1).hashCode());
		System.out.println("car 11 hashcode:"+carMap.get(11).hashCode());
		System.out.println("car 5 hashcode:"+carMap.get(5).hashCode());
	}

}