/*
 * 
 * Complete the code segment to rename an already created table named ‘PLAYERS’ into ‘SPORTS’.
 * 
 */

package week10;
import java.sql.*;

public class week10q5 {
	public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              String query = "ALTER TABLE PLAYERS RENAME to SPORTS";
              stmt.executeUpdate(query);
        }
        catch(Exception e){ System.out.println(e);}  
     }
}
