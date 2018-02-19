package com.cardealermvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.cardealermvc.service.CarService;

public class CarController {
	private CarService carservice;

	/**
	 * @param carservice the carservice to set
	 */
	@Autowired(required=true)
	public void setCarservice(CarService carservice) {
		this.carservice = carservice;
	}
}
