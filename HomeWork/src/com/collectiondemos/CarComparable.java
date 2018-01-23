package com.collectiondemos;

public class CarComparable implements Comparable<CarComparable> {
	String make,makeYear,color;
	int price;

	public CarComparable(String make, String makeYear, String color, int price) {
		super();
		this.make = make;
		this.makeYear = makeYear;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public int compareTo(CarComparable o) {
		if(price == o.price)
			return 0;
		else if(price > o.price)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "CarComparable [make=" + make + ", makeYear=" + makeYear + ", color=" + color + ", price=" + price + "]";
	}

}
