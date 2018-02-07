package com.hashmapdemo;

public class Car {
	int makeYear;
	String make;
	int id;
	boolean flag;
	
	public Car(int makeYear, String make, int id) {
		super();
		this.id = id;
		this.makeYear = makeYear;
		this.make = make;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Car [makeYear=" + makeYear + ", make=" + make + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + makeYear;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if(!(obj instanceof Car)){
			return false;
		}	
		Car car = (Car)obj;
		return car.make.equals(make) && car.makeYear == makeYear;
	}
}
