package com.rt.dealerjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ExecuteQuery {
	
	//public ResultSet query(String query) {	}
	public static boolean validateUser(String uname, String upassword){
		boolean flag=false;
		DbConnection dbInstance = DbConnection.getInstance();
		try {
			Connection con = dbInstance.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users where name=? and password=?");
			ps.setString(1, uname);
			ps.setString(2, upassword);
			ResultSet rs = ps.executeQuery();
			flag = rs.next();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}
	
	public static ResultSet query() throws ClassNotFoundException, SQLException {	
		DbConnection dbInstance = DbConnection.getInstance();
	
			Connection con = dbInstance.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT model.name, model.make, car.make_year,car.type, car.color,model.price"
														+ " FROM car"
														+ " INNER JOIN model ON car.model_id=model.id");
			ResultSet rs = ps.executeQuery();
			return rs;
	}

}
