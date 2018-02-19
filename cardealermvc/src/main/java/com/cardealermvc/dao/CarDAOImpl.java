package com.cardealermvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.cardealermvc.model.Car;

@Repository
public class CarDAOImpl implements CarDAO {

	public List<Car> getCars() {
		Session session = DbUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria cr = session.createCriteria(Car.class);
		List<Car> carlist = cr.list();
		session.getTransaction().commit();
		session.close();
		return carlist;
	}

}
