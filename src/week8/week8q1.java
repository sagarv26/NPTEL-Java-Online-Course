/*
 * 
 * Write a program which will print a pyramid of "*" 's of height "n" and print the number of "*" 's in the pyramid.
	For example:
	input : 5
	output:  
	
	        * 
	
	      * * * 
	
	    * * * * * 
	
	  * * * * * * * 
	
	* * * * * * * * * 
	
	25
 * 
 */

package week8;
import java.util.*;

public class week8q1 {

	private static Scanner inr;

	public static void main(String[] args) {
		inr = new Scanner(System.in);
		int n = inr.nextInt();
		
		int space = n,numbers=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<space;j++) {
				System.out.print("  ");
			}
			space-=1;
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("* ");
				numbers++;
			}
			System.out.println();
		}
		System.out.print(numbers);
		
	}

}
