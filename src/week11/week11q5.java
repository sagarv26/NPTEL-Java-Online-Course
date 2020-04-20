/*
 * 
 * Complete the code segment to drop the table named ‘PLAYERS’.
 * 
 */

package week11;

import java.sql.*;

public class week11q5 {

	public static void main(String args[]) {
		try {
			Connection conn = null;
			Statement stmt = null;
			String DB_URL = "jdbc:sqlite:/tempfs/db";
			System.setProperty("org.sqlite.tmpdir", "/tempfs");
			String query = "";

			// Open a connection
			conn = DriverManager.getConnection(DB_URL);
			stmt = conn.createStatement();

			query = "DROP TABLE PLAYERS";
			stmt.executeUpdate(query);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
