/*
 * 
 * Complete the code segment to catch the exception in the following, if any. 
 * On the occurrence of such an exception, your program should print “Please enter valid data” .
 * If there is no such exception, it will print the "square of the number".
 * 
 */

package week7;
import java.io.*; 
public class week7q2 {

	public static void main(String args[]){   
	   
	try {
		InputStreamReader r=new InputStreamReader(System.in);  
	    BufferedReader br=new BufferedReader(r);  
	    String number;
		number = br.readLine();
		int x = Integer.parseInt(number);
		System.out.println(x*x);
		
	} catch (IOException e) {
		System.out.println("Please enter valid data");
	} catch (NumberFormatException e) {
		System.out.println("Please enter valid data");
	}
	   
	}
}
