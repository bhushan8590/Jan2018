package com.cardealermvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cardealermvc.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	public boolean validateUser(String uname, String upassword) {
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

	public boolean insertNewUser(String name, String password) {
		
		Session session = DbUtility.getSessionFactory().openSession();
		boolean flag = false;
		session.beginTransaction();
		User newUser = new User();
		newUser.setName(name);
		newUser.setPassword(password);
		try {
			session.save(newUser);
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
