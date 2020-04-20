/*
 * 
 * The following code needs some package to work properly. 
 * Write appropriate code to import the required package(s) in order to make the program compile and execute successfully.
 * 
 */
package week10;
import java.sql.*;

public class week10q1 {
	public static void main(String args[]) {
        try {
              Connection conn = null;
               
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              conn = DriverManager.getConnection(DB_URL);
              conn.close();
              System.out.print(conn.isClosed());
        }
       catch(Exception e){ System.out.println(e);}  
    }

}
