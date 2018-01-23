package com.carsearch;

public class Car {
 String make,model,year,color;
 //String type;

public Car(String make, String model, String year, String color) {
	super();
	this.make = make;
	this.year = year;
	this.color = color;
	this.model = model;
	//this.type = type;
}

@Override
public String toString() {
	return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + "]";
}


public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

/*public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}*/
 
}
