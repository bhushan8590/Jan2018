package com.cardealermvc.dao;

import java.sql.SQLException;

public interface UserDAO {
	public boolean validateUser(String uname, String upassword);
	public boolean insertNewUser(String name, String password);
}
