package com.dealer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class TestDb {
	final static Logger logger = Logger.getLogger(TestDb.class.getName());

	public static void main(String[] args) {

		String query = "SELECT * FROM customer";
		DbConnection dbInstance = DbConnection.getInstance();
		try {
			Connection con = dbInstance.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" "+rs.getString(2)+"
				// "+rs.getString(3));
				logger.debug(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
