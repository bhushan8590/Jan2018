package com.tc;

public class Car {
	private  int vin,price;
	private String make,model;
	
	public Car(int vin, int price, String make, String model) {
		super();
		this.vin = vin;
		this.price = price;
		this.make = make;
		this.model = model;
	}
	/**
	 * @return the vin
	 */
	public int getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(int vin) {
		this.vin = vin;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [vin=" + vin + ", price=" + price + ", make=" + make + ", model=" + model + "]";
	}
	
}
