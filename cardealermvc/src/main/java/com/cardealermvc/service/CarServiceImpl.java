package com.cardealermvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardealermvc.dao.CarDAO;
import com.cardealermvc.model.Car;

@Service
public class CarServiceImpl implements CarService {
	private CarDAO carDAO;

	/**
	 * @param carDAO the carDAO to set
	 */
	@Autowired(required=true)
	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

	public List<Car> getCars() {
		return this.carDAO.getCars();
	}
	
}
