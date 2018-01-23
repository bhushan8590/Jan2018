package com.dealerdbclasses;

public class Car {
	
	int id,modelId;
	String type,color,makeYear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", modelId=" + modelId + ", type=" + type + ", color=" + color + ", makeYear="
				+ makeYear + "]";
	}
	
}
