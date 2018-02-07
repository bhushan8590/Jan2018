package com.carproject.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ExecuteQuery {
	
	//public ResultSet query(String query) {	}
	public static boolean validateUser(String uname, String upassword){
		//int pass = upassword.hashCode();
		boolean flag=false;
		DbConnection dbInstance = DbConnection.getInstance();
		try {
			Connection con = dbInstance.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users where name=? and password=?");
			ps.setString(1, uname);
			//ps.setInt(2, pass);
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
			PreparedStatement ps = con.prepareStatement("SELECT model.name, model.make, car.make_year,car.type, car.color,model.price,car.id"
														+ " FROM car"
														+ " INNER JOIN model ON car.model_id=model.id");
			ResultSet rs = ps.executeQuery();
			return rs;
	}
	
	public static boolean insertNewUser(String name, String password) throws ClassNotFoundException, SQLException{
		//int pass = password.hashCode();
		DbConnection dbInstance = DbConnection.getInstance();
		Connection con = dbInstance.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into users(name,password) values(?,?)");
		ps.setString(1, name);
		//ps.setInt(2, pass);
		ps.setString(2, password);
		int a = ps.executeUpdate();
		con.close();
		if(a==0){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean isAdmin(String name) throws ClassNotFoundException, SQLException{
		int a=0;
		DbConnection dbInstance = DbConnection.getInstance();
		Connection con = dbInstance.getConnection();
		PreparedStatement ps = con.prepareStatement("select admin from users where name=?");
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			a = rs.getInt("admin");
		}
		con.close();
		if(a==0){
			return false;
		}else{
			return true;
		}
	}
	
	public static void addCar(){
		
	}
	
	public static void deleteCar(int id) throws ClassNotFoundException, SQLException{
		int result=0;
		DbConnection dbInstance = DbConnection.getInstance();
		Connection con = dbInstance.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from car where id=?");
		ps.setInt(1, id);
		result = ps.executeUpdate();
	}

}
