/*
 * 
 * Complete the following program to calculate the average age of the players in the table ‘PLAYERS’
 * 
 */
package week11;

import java.sql.*;

public class week11q4 {
	 public static void main(String args[]) {
	        try {
	              Connection conn = null;
	              Statement stmt = null;
	              String DB_URL = "jdbc:sqlite:/tempfs/db";
	              System.setProperty("org.sqlite.tmpdir", "/tempfs");
	              String query="";
	              // Open a connection
	              conn = DriverManager.getConnection(DB_URL);
	              stmt = conn.createStatement();
	              int count = 0, sum = 0;
	              String sql = "select age from PLAYERS";
	              ResultSet rs = stmt.executeQuery(sql);

	              while(rs.next()){
	                sum+=rs.getInt("Age");
	                count++;
	              }
	              // Write program to calculate the average age
	              int avg = sum/count;
	              // Print “Average age of players is XX” ; where XX is the INTEGER value of age.
	              System.out.println("Average age of players is "+avg);
	              
            }
            catch(Exception e){ System.out.println(e);}  
}  
}
