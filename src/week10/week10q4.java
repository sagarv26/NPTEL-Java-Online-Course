/**
 * Complete the code segment to create a new table named ‘PLAYERS’ in SQL database using the following information.
 *  Expected Output:
 
	No. of columns : 4\n
	Column 1 Name: UID\n
	Column 1 Type : INT\n
	Column 2 Name: First_Name\n
	Column 2 Type : VARCHAR\n
	Column 3 Name: Last_Name\n
	Column 3 Type : VARCHAR\n
	Column 4 Name: Age\n
	Column 5 Type : INT\n
 */

package week10;
import java.sql.*;


public class week10q4 {
	 public static void main(String args[]) {
	        try {
	              Connection conn = null;
	              Statement stmt = null;
	              String DB_URL = "jdbc:sqlite:/tempfs/db";
	              System.setProperty("org.sqlite.tmpdir", "/tempfs");
	            
	              // Open a connection
	              conn = DriverManager.getConnection(DB_URL);
	              stmt = conn.createStatement();
	              
	              String query = "CREATE TABLE PLAYERS "
	              		    +    "("
	            		  	+    "UID INT ,"
	            		  	+    "First_Name Varchar(45) ,"
	            		  	+    "Last_Name Varchar(45) ,"
	            		  	+    "Age INT"
	            		  	+    ");";
	              
	              stmt.executeUpdate(query);  
	        }
	        catch(Exception e){ System.out.println(e);}  
	     }
}
