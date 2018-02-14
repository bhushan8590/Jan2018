package com.carproject.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import org.dom4j.rule.Mode;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DbService {
	
	public static boolean validateUser(String uname, String upassword){
		boolean flag=false;
		Session session = DbUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("name", uname));
		cr.add(Restrictions.eq("password", upassword));
		List<User> ulist = cr.list();
		if(ulist.isEmpty()){
			flag=false;
		}else{
			flag=true;
		}
		session.getTransaction().commit();
		session.close();
		return flag;
	}
	
	public static List<Car> query() throws ClassNotFoundException, SQLException {	
		Session session = DbUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria cr = session.createCriteria(Car.class);
		List<Car> carlist = cr.list();
		session.getTransaction().commit();
		session.close();
		return carlist;
	}
	
	public static boolean insertNewUser(String name, String password) throws ClassNotFoundException, SQLException{
		
		Session session = DbUtility.getSessionFactory().openSession();
		boolean flag = false;
		session.beginTransaction();
		User newUser = new User();
		newUser.setName(name);
		newUser.setPassword(password);
		try {
			session.save(newUser);
			session.flush();
			flag = true;
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			session.getTransaction().commit();
			session.close();
		}
		if(flag){
			return flag;
		}
		return flag;
	}
}
