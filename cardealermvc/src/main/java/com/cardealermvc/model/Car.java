package com.cardealermvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	@Id
	int id;
	@ManyToOne
	@JoinColumn(name="model_id")
	Model model_id;
	String make_year;
	String type;
	String color;
	
	
	public Car() {
	
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the model_id
	 */
	public Model getModel_id() {
		return model_id;
	}

	/**
	 * @param model_id the model_id to set
	 */
	public void setModel_id(Model model_id) {
		this.model_id = model_id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the make_year
	 */
	public String getMake_year() {
		return make_year;
	}

	/**
	 * @param make_year the make_year to set
	 */
	public void setMake_year(String make_year) {
		this.make_year = make_year;
	}
}
