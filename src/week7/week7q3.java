/**
 * 
 * A byte char array is initialized. You have to enter an index value"n". 
 * According to index your program will print the byte and its corresponding char value.
 * Complete the code segment to catch the exception in the following, if any. 
 * on the occurrence of such an exception, your program should print “exception occur” .
 * If there is no such exception, it will print the required output.
 *
 */

package week7;
import java.util.*;

public class week7q3 {

	
	private static Scanner inr;

	public static void main(String[] args) {
		try{	
			  byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','A','N','-','N','O','C','C','S','E'};
		      inr = new Scanner(System.in);
			  int n = inr.nextInt();
			  
			  System.out.println(barr[n]);
			  System.out.print((char)barr[n]);
		} catch (Exception e){
		    System.out.println("exception occur");
		}	  

	}

}
