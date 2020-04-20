/*
 * 
 * Write the required code in order to update the following data in the table ‘PLAYERS’.
 * 
 */

package week11;

import java.sql.*;
public class week11q2 {
	public static void main(String args[]) {
		try {
			Connection conn = null;
			Statement stmt = null;
			String DB_URL = "jdbc:sqlite:/tempfs/db";
			System.setProperty("org.sqlite.tmpdir", "/tempfs");
			
			// Open a connection
			conn = DriverManager.getConnection(DB_URL);
			stmt = conn.createStatement();
			String sql = "update players set age = 26 where uid = 1";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
