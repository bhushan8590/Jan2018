package com.cardealermvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardealermvc.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;	
	/**
	 * @param userDAO the userDAO to set
	 */
	@Autowired(required=true)
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean validateUser(String uname, String upassword) {
		return this.userDAO.validateUser(uname, upassword);
	}

	public boolean insertNewUser(String name, String password) {
		return this.userDAO.insertNewUser(name, password);
	}

}
