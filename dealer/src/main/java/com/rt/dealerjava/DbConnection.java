package com.rt.dealerjava;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import org.apache.log4j.Logger;

public class DbConnection {
	
	//final static Logger logger = Logger.getLogger(DbConnection.class.getName());

	private static DbConnection db;
	private Properties prop = new Properties();

	// Private Constructor to create only single instance (i.e. to implement Singleton Pattern)
	private DbConnection() {
	}
	
	// Static synchronized method to get single instance of class with thread safe
	public static synchronized DbConnection getInstance() {
		if (db == null) {
			db = new DbConnection();
		}
		return db;
	}
	
	// Read the properties file and get the connection object to database
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		InputStream input = null;
		String propertiesFileName = "dbconfig.properties";
		String url, dbName, driver, userName, password;

		try {
			input = DbConnection.class.getClassLoader().getResourceAsStream(propertiesFileName);
			if (input == null) {
				System.out.println("Sorry, unable to find " + propertiesFileName);
			}
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		url = prop.getProperty("URL");
		dbName = prop.getProperty("NAME");
		driver = prop.getProperty("DRIVER");
		userName = prop.getProperty("USER");
		password = prop.getProperty("PASSWORD");
		Class.forName(driver);
		con = DriverManager.getConnection(url + dbName, userName, password);
		return con;

	}

}
