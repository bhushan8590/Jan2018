package com.cardealermvc.service;

public interface UserService {
	public boolean validateUser(String uname, String upassword);
	public boolean insertNewUser(String name, String password);
}
