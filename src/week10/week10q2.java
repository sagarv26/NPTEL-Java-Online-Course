/*
 * 
 * Write the JDBC codes needed to create a Connection interface using the DriverManager class and the variable DB_URL. 
 * Check whether the connection is successful using 'isAlive(timeout)' method to generate the output, which is either 'true' or 'false'.
 * 
 */

package week10;
import java.sql.*;
public class week10q2 {
	public static void main(String args[]) {
        try {
              Connection conn = null;
               
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              conn = DriverManager.getConnection(DB_URL);
              
              if ( conn.isClosed() ) {
                    System.out.print("false");
              }
              else
              {
                System.out.print("true");
              }
        }
        catch(Exception e){ System.out.println(e);}  
     }

}
