/*
 * 
 * Complete the code segment to insert the following data using prepared statement in the existing table ‘PLAYERS’.
 * 
 */

package week11;

import java.sql.*;

public class week11q1 {

	public static void main(String args[]) {
		try {
			Connection conn = null;
			String DB_URL = "jdbc:sqlite:/tempfs/db";
			System.setProperty("org.sqlite.tmpdir", "/tempfs");

			// Open a connection
			conn = DriverManager.getConnection(DB_URL);
		
			PreparedStatement stmt1 = conn.prepareStatement("insert into PLAYERS values(?,?,?,?)");
			stmt1.setInt(1, 1);
			stmt1.setString(2, "Ram");
			stmt1.setString(3, "Gopal");
			stmt1.setInt(4, 26);
			stmt1.executeUpdate();

			PreparedStatement stmt2 = conn.prepareStatement("insert into PLAYERS values(?,?,?,?)");
			stmt2.setInt(1, 2);
			stmt2.setString(2, "John");
			stmt2.setString(3, "Mayer");
			stmt2.setInt(4, 22);
			stmt2.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
