package com.collectionhw;

public class Car {
	private int year,vinNo;
	private String make,model;
	
	public Car(int year, int vinNo, String make, String model) {
		super();
		this.year = year;
		this.vinNo = vinNo;
		this.make = make;
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getVinNo() {
		return vinNo;
	}
	public void setVinNo(int vinNo) {
		this.vinNo = vinNo;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [year=" + year + ", vinNo=" + vinNo + ", make=" + make + ", model=" + model + "]";
	}
}
